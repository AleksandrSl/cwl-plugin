cwlVersion: v1.0
class: CommandLineTool

baseCommand: [cut]

id: "223123"

label: "2131"

requirements:
    - class: DockerRequirement
      dockerFile: |
       some
          text
             describing
        image
    - class: InlineJavascriptRequirement

inputs:

  in_file:
    type: File
    inputBinding:
      position: 2
      prefix: "-f"

  column:
    type: int
    inputBinding:
      position: 3
      prefix: "-f"

outputs:
  out_f:
    type: boolean

