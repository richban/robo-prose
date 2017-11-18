
const eventImpl = {
    obstacle: `
onevent prox
if prox.horizontal[0] > 1000 or prox.horizontal[1] > 1000 or prox.horizontal[2] > 1000 or prox.horizontal[3] > 1000 or prox.horizontal[4] > 1000 or prox.horizontal[5] > 1000 or prox.horizontal[6] > 1000 then
    emit obstacle
end
`,
    tapped: `
onevent tap
emit tapped
`
};

module.exports = (name, events) => {
    return `
<!DOCTYPE aesl-source>
<network>


<!--list of global events-->
${
    events.map(event => `<event size="0" name="${ event }"/>`)
        .join('\n')
}

<!--list of constants-->


<!--show keywords state-->
<keywords flag="true"/>


<!--node thymio-II-->
<node name="${ name }">
${
    events.map(event => eventImpl[event])
        .join('\n\n')
}

onevent button.forward
motor.left.target = 0
motor.right.target = 0

</node>


</network>
`;
};
