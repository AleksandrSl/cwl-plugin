// This is a generated file. Not intended for manual editing.
package com.cwlplugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.cwlplugin.psi.CwlTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CwlParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == COMMAND_INPUT_ARRAY_ITEMS) {
      r = command_input_array_items(b, 0);
    }
    else if (t == COMMAND_INPUT_ARRAY_SCHEMA) {
      r = command_input_array_schema(b, 0);
    }
    else if (t == COMMAND_INPUT_ARRAY_SCHEMA_ARRAY) {
      r = command_input_array_schema_array(b, 0);
    }
    else if (t == COMMAND_INPUT_ENUM_SCHEMA) {
      r = command_input_enum_schema(b, 0);
    }
    else if (t == COMMAND_INPUT_ENUM_SCHEMA_ARRAY) {
      r = command_input_enum_schema_array(b, 0);
    }
    else if (t == COMMAND_INPUT_PARAMETER) {
      r = command_input_parameter(b, 0);
    }
    else if (t == COMMAND_INPUT_PARAMETER_FIELD) {
      r = command_input_parameter_field(b, 0);
    }
    else if (t == COMMAND_INPUT_RECORD_FIELD) {
      r = command_input_record_field(b, 0);
    }
    else if (t == COMMAND_INPUT_RECORD_FIELD_TYPE) {
      r = command_input_record_field_type(b, 0);
    }
    else if (t == COMMAND_INPUT_RECORD_FIELDS) {
      r = command_input_record_fields(b, 0);
    }
    else if (t == COMMAND_INPUT_RECORD_SCHEMA_ARRAY) {
      r = command_input_record_schema_array(b, 0);
    }
    else if (t == COMMAND_LINE_BINDING_FIELD) {
      r = command_line_binding_field(b, 0);
    }
    else if (t == COMMAND_LINE_TOOL_FIELD) {
      r = command_line_tool_field(b, 0);
    }
    else if (t == COMMAND_OUTPUT_ARRAY_ITEMS) {
      r = command_output_array_items(b, 0);
    }
    else if (t == COMMAND_OUTPUT_ARRAY_SCHEMA) {
      r = command_output_array_schema(b, 0);
    }
    else if (t == COMMAND_OUTPUT_ARRAY_SCHEMA_ARRAY) {
      r = command_output_array_schema_array(b, 0);
    }
    else if (t == COMMAND_OUTPUT_BINDING) {
      r = command_output_binding(b, 0);
    }
    else if (t == COMMAND_OUTPUT_BINDING_FIELD) {
      r = command_output_binding_field(b, 0);
    }
    else if (t == COMMAND_OUTPUT_ENUM_SCHEMA) {
      r = command_output_enum_schema(b, 0);
    }
    else if (t == COMMAND_OUTPUT_ENUM_SCHEMA_ARRAY) {
      r = command_output_enum_schema_array(b, 0);
    }
    else if (t == COMMAND_OUTPUT_PARAMETER) {
      r = command_output_parameter(b, 0);
    }
    else if (t == COMMAND_OUTPUT_PARAMETER_FIELD) {
      r = command_output_parameter_field(b, 0);
    }
    else if (t == COMMAND_OUTPUT_RECORD_FIELD) {
      r = command_output_record_field(b, 0);
    }
    else if (t == COMMAND_OUTPUT_RECORD_FIELD_TYPE) {
      r = command_output_record_field_type(b, 0);
    }
    else if (t == COMMAND_OUTPUT_RECORD_FIELDS) {
      r = command_output_record_fields(b, 0);
    }
    else if (t == COMMAND_OUTPUT_RECORD_SCHEMA) {
      r = command_output_record_schema(b, 0);
    }
    else if (t == COMMAND_OUTPUT_RECORD_SCHEMA_ARRAY) {
      r = command_output_record_schema_array(b, 0);
    }
    else if (t == CWL_TYPE) {
      r = cwl_type(b, 0);
    }
    else if (t == CWL_TYPE_ARRAY) {
      r = cwl_type_array(b, 0);
    }
    else if (t == DIRECTORY) {
      r = directory(b, 0);
    }
    else if (t == DIRECTORY_ARRAY) {
      r = directory_array(b, 0);
    }
    else if (t == DIRECTORY_FIELD) {
      r = directory_field(b, 0);
    }
    else if (t == DIRENT) {
      r = dirent(b, 0);
    }
    else if (t == DIRENT_ARRAY) {
      r = dirent_array(b, 0);
    }
    else if (t == FILE_) {
      r = file_(b, 0);
    }
    else if (t == FILE_ARRAY) {
      r = file_array(b, 0);
    }
    else if (t == FILE_FIELD) {
      r = file_field(b, 0);
    }
    else if (t == INITIAL_WORKDIR_LISTING) {
      r = initial_workdir_listing(b, 0);
    }
    else if (t == INPUTS) {
      r = inputs(b, 0);
    }
    else if (t == INT_ARRAY) {
      r = int_array(b, 0);
    }
    else if (t == OUTPUT_BINDING) {
      r = output_binding(b, 0);
    }
    else if (t == PACKAGES) {
      r = packages(b, 0);
    }
    else if (t == RECORD_TYPE) {
      r = record_type(b, 0);
    }
    else if (t == REQUIREMENT) {
      r = requirement(b, 0);
    }
    else if (t == REQUIREMENTS) {
      r = requirements(b, 0);
    }
    else if (t == RESOURCE_REQUIREMENT_FIELD) {
      r = resource_requirement_field(b, 0);
    }
    else if (t == SOFTWARE_PACKAGE) {
      r = software_package(b, 0);
    }
    else if (t == SOFTWARE_PACKAGE_ARRAY) {
      r = software_package_array(b, 0);
    }
    else if (t == SYMBOLS) {
      r = symbols(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return cwl_file(b, l + 1);
  }

  /* ********************************************************** */
  // string_array | expression_array | command_line_binding_array
  static boolean arguments(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "arguments")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = string_array(b, l + 1);
    if (!r) r = expression_array(b, l + 1);
    if (!r) r = command_line_binding_array(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TYPE COLON ARRAY_TYPE
  static boolean array_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_type")) return false;
    if (!nextTokenIs(b, TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TYPE, COLON, ARRAY_TYPE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BASECOMMAND COLON (STRING | string_array)
  static boolean base_command(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_command")) return false;
    if (!nextTokenIs(b, BASECOMMAND)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, BASECOMMAND, COLON);
    r = r && base_command_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // STRING | string_array
  private static boolean base_command_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "base_command_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    if (!r) r = string_array(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // BASENAME COLON STRING
  static boolean basename(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "basename")) return false;
    if (!nextTokenIs(b, BASENAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, BASENAME, COLON, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CHECKSUM COLON STRING
  static boolean checksum(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "checksum")) return false;
    if (!nextTokenIs(b, CHECKSUM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CHECKSUM, COLON, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // cwl_type
  //                           | command_input_enum_schema
  //                           | STRING
  //                           | cwl_type_array
  //                           | command_input_record_schema_array
  //                           | command_input_enum_schema_array
  //                           | command_input_array_schema_array
  //                           | string_array
  //                           | command_input_array_schema
  //                           | command_input_record_schema
  public static boolean command_input_array_items(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_input_array_items")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMAND_INPUT_ARRAY_ITEMS, "<command input array items>");
    r = cwl_type(b, l + 1);
    if (!r) r = command_input_enum_schema(b, l + 1);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = cwl_type_array(b, l + 1);
    if (!r) r = command_input_record_schema_array(b, l + 1);
    if (!r) r = command_input_enum_schema_array(b, l + 1);
    if (!r) r = command_input_array_schema_array(b, l + 1);
    if (!r) r = string_array(b, l + 1);
    if (!r) r = command_input_array_schema(b, l + 1);
    if (!r) r = command_input_record_schema(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // array_type | label | input_binding | command_input_array_items
  public static boolean command_input_array_schema(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_input_array_schema")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMAND_INPUT_ARRAY_SCHEMA, "<command input array schema>");
    r = array_type(b, l + 1);
    if (!r) r = label(b, l + 1);
    if (!r) r = input_binding(b, l + 1);
    if (!r) r = command_input_array_items(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LBRACKET (command_input_array_schema COMMA) * command_input_array_schema RBRACKET
  public static boolean command_input_array_schema_array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_input_array_schema_array")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && command_input_array_schema_array_1(b, l + 1);
    r = r && command_input_array_schema(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, COMMAND_INPUT_ARRAY_SCHEMA_ARRAY, r);
    return r;
  }

  // (command_input_array_schema COMMA) *
  private static boolean command_input_array_schema_array_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_input_array_schema_array_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!command_input_array_schema_array_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "command_input_array_schema_array_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // command_input_array_schema COMMA
  private static boolean command_input_array_schema_array_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_input_array_schema_array_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = command_input_array_schema(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // symbols | enum_type | label | input_binding
  public static boolean command_input_enum_schema(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_input_enum_schema")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMAND_INPUT_ENUM_SCHEMA, "<command input enum schema>");
    r = symbols(b, l + 1);
    if (!r) r = enum_type(b, l + 1);
    if (!r) r = label(b, l + 1);
    if (!r) r = input_binding(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LBRACKET (command_input_enum_schema COMMA) * command_input_enum_schema RBRACKET
  public static boolean command_input_enum_schema_array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_input_enum_schema_array")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && command_input_enum_schema_array_1(b, l + 1);
    r = r && command_input_enum_schema(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, COMMAND_INPUT_ENUM_SCHEMA_ARRAY, r);
    return r;
  }

  // (command_input_enum_schema COMMA) *
  private static boolean command_input_enum_schema_array_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_input_enum_schema_array_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!command_input_enum_schema_array_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "command_input_enum_schema_array_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // command_input_enum_schema COMMA
  private static boolean command_input_enum_schema_array_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_input_enum_schema_array_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = command_input_enum_schema(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER COLON  command_input_parameter_field +
  public static boolean command_input_parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_input_parameter")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COLON);
    r = r && command_input_parameter_2(b, l + 1);
    exit_section_(b, m, COMMAND_INPUT_PARAMETER, r);
    return r;
  }

  // command_input_parameter_field +
  private static boolean command_input_parameter_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_input_parameter_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = command_input_parameter_field(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!command_input_parameter_field(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "command_input_parameter_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // default | doc | format | id | input_binding | label | secondary_files | streamable | type
  public static boolean command_input_parameter_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_input_parameter_field")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMAND_INPUT_PARAMETER_FIELD, "<command input parameter field>");
    r = default_$(b, l + 1);
    if (!r) r = doc(b, l + 1);
    if (!r) r = format(b, l + 1);
    if (!r) r = id(b, l + 1);
    if (!r) r = input_binding(b, l + 1);
    if (!r) r = label(b, l + 1);
    if (!r) r = secondary_files(b, l + 1);
    if (!r) r = streamable(b, l + 1);
    if (!r) r = type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // name | doc | input_binding | label | command_input_record_field_type
  public static boolean command_input_record_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_input_record_field")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMAND_INPUT_RECORD_FIELD, "<command input record field>");
    r = name(b, l + 1);
    if (!r) r = doc(b, l + 1);
    if (!r) r = input_binding(b, l + 1);
    if (!r) r = label(b, l + 1);
    if (!r) r = command_input_record_field_type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // cwl_type
  // | command_input_enum_schema
  // | STRING
  // | cwl_type_array
  // | command_input_record_schema_array
  // | command_input_enum_schema_array
  // | command_input_array_schema_array
  // | string_array
  // | command_input_record_schema
  // | command_input_array_schema
  public static boolean command_input_record_field_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_input_record_field_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMAND_INPUT_RECORD_FIELD_TYPE, "<command input record field type>");
    r = cwl_type(b, l + 1);
    if (!r) r = command_input_enum_schema(b, l + 1);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = cwl_type_array(b, l + 1);
    if (!r) r = command_input_record_schema_array(b, l + 1);
    if (!r) r = command_input_enum_schema_array(b, l + 1);
    if (!r) r = command_input_array_schema_array(b, l + 1);
    if (!r) r = string_array(b, l + 1);
    if (!r) r = command_input_record_schema(b, l + 1);
    if (!r) r = command_input_array_schema(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // command_input_record_field *
  public static boolean command_input_record_fields(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_input_record_fields")) return false;
    Marker m = enter_section_(b, l, _NONE_, COMMAND_INPUT_RECORD_FIELDS, "<command input record fields>");
    int c = current_position_(b);
    while (true) {
      if (!command_input_record_field(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "command_input_record_fields", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // record_type | label | command_input_record_fields
  static boolean command_input_record_schema(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_input_record_schema")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _LEFT_INNER_);
    r = record_type(b, l + 1);
    if (!r) r = label(b, l + 1);
    if (!r) r = command_input_record_fields(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LBRACKET (command_input_record_schema COMMA) * command_input_record_schema RBRACKET
  public static boolean command_input_record_schema_array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_input_record_schema_array")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && command_input_record_schema_array_1(b, l + 1);
    r = r && command_input_record_schema(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, COMMAND_INPUT_RECORD_SCHEMA_ARRAY, r);
    return r;
  }

  // (command_input_record_schema COMMA) *
  private static boolean command_input_record_schema_array_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_input_record_schema_array_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!command_input_record_schema_array_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "command_input_record_schema_array_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // command_input_record_schema COMMA
  private static boolean command_input_record_schema_array_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_input_record_schema_array_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = command_input_record_schema(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACKET (input_binding COMMA) * input_binding RBRACKET
  static boolean command_line_binding_array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_line_binding_array")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && command_line_binding_array_1(b, l + 1);
    r = r && input_binding(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // (input_binding COMMA) *
  private static boolean command_line_binding_array_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_line_binding_array_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!command_line_binding_array_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "command_line_binding_array_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // input_binding COMMA
  private static boolean command_line_binding_array_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_line_binding_array_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = input_binding(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // load_contents
  // | value_from
  // | position
  // | separate
  // | item_separator
  // | prefix
  // | shell_quote
  public static boolean command_line_binding_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_line_binding_field")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMAND_LINE_BINDING_FIELD, "<command line binding field>");
    r = load_contents(b, l + 1);
    if (!r) r = value_from(b, l + 1);
    if (!r) r = position(b, l + 1);
    if (!r) r = separate(b, l + 1);
    if (!r) r = item_separator(b, l + 1);
    if (!r) r = prefix(b, l + 1);
    if (!r) r = shell_quote(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // command_line_tool_field *
  static boolean command_line_tool(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_line_tool")) return false;
    int c = current_position_(b);
    while (true) {
      if (!command_line_tool_field(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "command_line_tool", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // CLASS COLON COMMAND_LINE_TOOL
  static boolean command_line_tool_class(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_line_tool_class")) return false;
    if (!nextTokenIs(b, CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CLASS, COLON, COMMAND_LINE_TOOL);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // inputs
  //     | outputs
  //     | command_line_tool_class
  //     | base_command
  //     | requirements
  //     | id
  //     | label
  //     | doc
  //     | hints
  //     | arguments
  //     | stderr
  //     | stdin
  //     | stdout
  //     | success_codes
  //     | temporary_fail_codes
  //     | permanent_fail_codes
  public static boolean command_line_tool_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_line_tool_field")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMAND_LINE_TOOL_FIELD, "<command line tool field>");
    r = inputs(b, l + 1);
    if (!r) r = outputs(b, l + 1);
    if (!r) r = command_line_tool_class(b, l + 1);
    if (!r) r = base_command(b, l + 1);
    if (!r) r = requirements(b, l + 1);
    if (!r) r = id(b, l + 1);
    if (!r) r = label(b, l + 1);
    if (!r) r = doc(b, l + 1);
    if (!r) r = hints(b, l + 1);
    if (!r) r = arguments(b, l + 1);
    if (!r) r = stderr(b, l + 1);
    if (!r) r = stdin(b, l + 1);
    if (!r) r = stdout(b, l + 1);
    if (!r) r = success_codes(b, l + 1);
    if (!r) r = temporary_fail_codes(b, l + 1);
    if (!r) r = permanent_fail_codes(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // command_output_record_field_type
  public static boolean command_output_array_items(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_output_array_items")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMAND_OUTPUT_ARRAY_ITEMS, "<command output array items>");
    r = command_output_record_field_type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // command_output_array_items | array_type | label | output_binding
  public static boolean command_output_array_schema(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_output_array_schema")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMAND_OUTPUT_ARRAY_SCHEMA, "<command output array schema>");
    r = command_output_array_items(b, l + 1);
    if (!r) r = array_type(b, l + 1);
    if (!r) r = label(b, l + 1);
    if (!r) r = output_binding(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LBRACKET (command_output_array_schema COMMA) * command_output_array_schema RBRACKET
  public static boolean command_output_array_schema_array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_output_array_schema_array")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && command_output_array_schema_array_1(b, l + 1);
    r = r && command_output_array_schema(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, COMMAND_OUTPUT_ARRAY_SCHEMA_ARRAY, r);
    return r;
  }

  // (command_output_array_schema COMMA) *
  private static boolean command_output_array_schema_array_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_output_array_schema_array_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!command_output_array_schema_array_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "command_output_array_schema_array_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // command_output_array_schema COMMA
  private static boolean command_output_array_schema_array_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_output_array_schema_array_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = command_output_array_schema(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // COLON  command_output_binding_field +
  public static boolean command_output_binding(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_output_binding")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COLON);
    r = r && command_output_binding_1(b, l + 1);
    exit_section_(b, m, COMMAND_OUTPUT_BINDING, r);
    return r;
  }

  // command_output_binding_field +
  private static boolean command_output_binding_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_output_binding_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = command_output_binding_field(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!command_output_binding_field(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "command_output_binding_1", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // glob | load_contents | output_eval
  public static boolean command_output_binding_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_output_binding_field")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMAND_OUTPUT_BINDING_FIELD, "<command output binding field>");
    r = glob(b, l + 1);
    if (!r) r = load_contents(b, l + 1);
    if (!r) r = output_eval(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // symbols | enum_type | label | output_binding
  public static boolean command_output_enum_schema(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_output_enum_schema")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMAND_OUTPUT_ENUM_SCHEMA, "<command output enum schema>");
    r = symbols(b, l + 1);
    if (!r) r = enum_type(b, l + 1);
    if (!r) r = label(b, l + 1);
    if (!r) r = output_binding(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LBRACKET (command_output_enum_schema COMMA) * command_output_enum_schema RBRACKET
  public static boolean command_output_enum_schema_array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_output_enum_schema_array")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && command_output_enum_schema_array_1(b, l + 1);
    r = r && command_output_enum_schema(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, COMMAND_OUTPUT_ENUM_SCHEMA_ARRAY, r);
    return r;
  }

  // (command_output_enum_schema COMMA) *
  private static boolean command_output_enum_schema_array_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_output_enum_schema_array_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!command_output_enum_schema_array_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "command_output_enum_schema_array_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // command_output_enum_schema COMMA
  private static boolean command_output_enum_schema_array_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_output_enum_schema_array_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = command_output_enum_schema(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // IDENTIFIER COLON  command_output_parameter_field +
  public static boolean command_output_parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_output_parameter")) return false;
    if (!nextTokenIs(b, IDENTIFIER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, IDENTIFIER, COLON);
    r = r && command_output_parameter_2(b, l + 1);
    exit_section_(b, m, COMMAND_OUTPUT_PARAMETER, r);
    return r;
  }

  // command_output_parameter_field +
  private static boolean command_output_parameter_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_output_parameter_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = command_output_parameter_field(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!command_output_parameter_field(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "command_output_parameter_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // id | label | secondary_files | format | streamable | doc | output_binding | type
  public static boolean command_output_parameter_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_output_parameter_field")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMAND_OUTPUT_PARAMETER_FIELD, "<command output parameter field>");
    r = id(b, l + 1);
    if (!r) r = label(b, l + 1);
    if (!r) r = secondary_files(b, l + 1);
    if (!r) r = format(b, l + 1);
    if (!r) r = streamable(b, l + 1);
    if (!r) r = doc(b, l + 1);
    if (!r) r = output_binding(b, l + 1);
    if (!r) r = type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // name | command_output_record_field_type | doc | output_binding
  public static boolean command_output_record_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_output_record_field")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMAND_OUTPUT_RECORD_FIELD, "<command output record field>");
    r = name(b, l + 1);
    if (!r) r = command_output_record_field_type(b, l + 1);
    if (!r) r = doc(b, l + 1);
    if (!r) r = output_binding(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // cwl_type
  // | command_output_enum_schema
  // | STRING
  // | cwl_type_array
  // | command_output_record_schema_array
  // | command_output_enum_schema_array
  // | command_output_array_schema_array
  // | string_array
  // | command_output_record_schema
  // | command_output_array_schema
  public static boolean command_output_record_field_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_output_record_field_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMAND_OUTPUT_RECORD_FIELD_TYPE, "<command output record field type>");
    r = cwl_type(b, l + 1);
    if (!r) r = command_output_enum_schema(b, l + 1);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = cwl_type_array(b, l + 1);
    if (!r) r = command_output_record_schema_array(b, l + 1);
    if (!r) r = command_output_enum_schema_array(b, l + 1);
    if (!r) r = command_output_array_schema_array(b, l + 1);
    if (!r) r = string_array(b, l + 1);
    if (!r) r = command_output_record_schema(b, l + 1);
    if (!r) r = command_output_array_schema(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // command_output_record_field *
  public static boolean command_output_record_fields(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_output_record_fields")) return false;
    Marker m = enter_section_(b, l, _NONE_, COMMAND_OUTPUT_RECORD_FIELDS, "<command output record fields>");
    int c = current_position_(b);
    while (true) {
      if (!command_output_record_field(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "command_output_record_fields", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, l, m, true, false, null);
    return true;
  }

  /* ********************************************************** */
  // record_type | command_output_record_fields | label
  public static boolean command_output_record_schema(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_output_record_schema")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMMAND_OUTPUT_RECORD_SCHEMA, "<command output record schema>");
    r = record_type(b, l + 1);
    if (!r) r = command_output_record_fields(b, l + 1);
    if (!r) r = label(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LBRACKET (command_output_record_schema COMMA) * command_output_record_schema RBRACKET
  public static boolean command_output_record_schema_array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_output_record_schema_array")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && command_output_record_schema_array_1(b, l + 1);
    r = r && command_output_record_schema(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, COMMAND_OUTPUT_RECORD_SCHEMA_ARRAY, r);
    return r;
  }

  // (command_output_record_schema COMMA) *
  private static boolean command_output_record_schema_array_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_output_record_schema_array_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!command_output_record_schema_array_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "command_output_record_schema_array_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // command_output_record_schema COMMA
  private static boolean command_output_record_schema_array_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "command_output_record_schema_array_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = command_output_record_schema(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CONTENTS COLON STRING
  static boolean contents(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "contents")) return false;
    if (!nextTokenIs(b, CONTENTS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CONTENTS, COLON, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CORES_MAX COLON (NUMBER | STRING | EXPRESSION)
  static boolean cores_max(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cores_max")) return false;
    if (!nextTokenIs(b, CORES_MAX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CORES_MAX, COLON);
    r = r && cores_max_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NUMBER | STRING | EXPRESSION
  private static boolean cores_max_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cores_max_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, EXPRESSION);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CORES_MIN COLON (NUMBER | STRING | EXPRESSION)
  static boolean cores_min(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cores_min")) return false;
    if (!nextTokenIs(b, CORES_MIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CORES_MIN, COLON);
    r = r && cores_min_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NUMBER | STRING | EXPRESSION
  private static boolean cores_min_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cores_min_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, EXPRESSION);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !<<eof>> cwl_version tool_description
  static boolean cwl_file(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cwl_file")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cwl_file_0(b, l + 1);
    r = r && cwl_version(b, l + 1);
    r = r && tool_description(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !<<eof>>
  private static boolean cwl_file_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cwl_file_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !eof(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // NULL_TYPE
  // | BOOLEAN_TYPE
  // | INT_TYPE
  // | LONG_TYPE
  // | FLOAT_TYPE
  // | DOUBLE_TYPE
  // | STRING_TYPE
  // | FILE_TYPE
  // | DIRECTORY_TYPE
  public static boolean cwl_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cwl_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CWL_TYPE, "<cwl type>");
    r = consumeToken(b, NULL_TYPE);
    if (!r) r = consumeToken(b, BOOLEAN_TYPE);
    if (!r) r = consumeToken(b, INT_TYPE);
    if (!r) r = consumeToken(b, LONG_TYPE);
    if (!r) r = consumeToken(b, FLOAT_TYPE);
    if (!r) r = consumeToken(b, DOUBLE_TYPE);
    if (!r) r = consumeToken(b, STRING_TYPE);
    if (!r) r = consumeToken(b, FILE_TYPE);
    if (!r) r = consumeToken(b, DIRECTORY_TYPE);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LBRACKET (cwl_type COMMA) * cwl_type RBRACKET
  public static boolean cwl_type_array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cwl_type_array")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && cwl_type_array_1(b, l + 1);
    r = r && cwl_type(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, CWL_TYPE_ARRAY, r);
    return r;
  }

  // (cwl_type COMMA) *
  private static boolean cwl_type_array_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cwl_type_array_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!cwl_type_array_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "cwl_type_array_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // cwl_type COMMA
  private static boolean cwl_type_array_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cwl_type_array_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = cwl_type(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CWL_VERSION COLON CWL_VERSION_VALUE
  static boolean cwl_version(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cwl_version")) return false;
    if (!nextTokenIs(b, CWL_VERSION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CWL_VERSION, COLON, CWL_VERSION_VALUE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DEFAULT COLON ANY
  static boolean default_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "default_$")) return false;
    if (!nextTokenIs(b, DEFAULT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DEFAULT, COLON, ANY);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CLASS COLON DIRECTORY_TYPE  directory_field +
  public static boolean directory(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "directory")) return false;
    if (!nextTokenIs(b, CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CLASS, COLON, DIRECTORY_TYPE);
    r = r && directory_3(b, l + 1);
    exit_section_(b, m, DIRECTORY, r);
    return r;
  }

  // directory_field +
  private static boolean directory_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "directory_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = directory_field(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!directory_field(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "directory_3", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACKET (directory COMMA) * directory RBRACKET
  public static boolean directory_array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "directory_array")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && directory_array_1(b, l + 1);
    r = r && directory(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, DIRECTORY_ARRAY, r);
    return r;
  }

  // (directory COMMA) *
  private static boolean directory_array_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "directory_array_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!directory_array_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "directory_array_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // directory COMMA
  private static boolean directory_array_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "directory_array_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = directory(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // location | path | basename | listing
  public static boolean directory_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "directory_field")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DIRECTORY_FIELD, "<directory field>");
    r = location(b, l + 1);
    if (!r) r = path(b, l + 1);
    if (!r) r = basename(b, l + 1);
    if (!r) r = listing(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // entry | entryname | writable
  public static boolean dirent(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dirent")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DIRENT, "<dirent>");
    r = entry(b, l + 1);
    if (!r) r = entryname(b, l + 1);
    if (!r) r = writable(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LBRACKET (dirent COMMA) * dirent RBRACKET
  public static boolean dirent_array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dirent_array")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && dirent_array_1(b, l + 1);
    r = r && dirent(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, DIRENT_ARRAY, r);
    return r;
  }

  // (dirent COMMA) *
  private static boolean dirent_array_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dirent_array_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!dirent_array_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "dirent_array_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // dirent COMMA
  private static boolean dirent_array_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dirent_array_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = dirent(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DIRNAME COLON STRING
  static boolean dirname(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "dirname")) return false;
    if (!nextTokenIs(b, DIRNAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DIRNAME, COLON, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DOC COLON (STRING | string_array)
  static boolean doc(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doc")) return false;
    if (!nextTokenIs(b, DOC)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOC, COLON);
    r = r && doc_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // STRING | string_array
  private static boolean doc_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "doc_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    if (!r) r = string_array(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DOCKER_FILE COLON STRING
  static boolean docker_file(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docker_file")) return false;
    if (!nextTokenIs(b, DOCKER_FILE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOCKER_FILE, COLON, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DOCKER_IMAGE_ID COLON STRING
  static boolean docker_image_id(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docker_image_id")) return false;
    if (!nextTokenIs(b, DOCKER_IMAGE_ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOCKER_IMAGE_ID, COLON, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DOCKER_IMPORT COLON STRING
  static boolean docker_import(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docker_import")) return false;
    if (!nextTokenIs(b, DOCKER_IMPORT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOCKER_IMPORT, COLON, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DOCKER_LOAD COLON STRING
  static boolean docker_load(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docker_load")) return false;
    if (!nextTokenIs(b, DOCKER_LOAD)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOCKER_LOAD, COLON, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DOCKER_OUTPUT_DIRECTORY COLON STRING
  static boolean docker_output_directory(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docker_output_directory")) return false;
    if (!nextTokenIs(b, DOCKER_OUTPUT_DIRECTORY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOCKER_OUTPUT_DIRECTORY, COLON, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DOCKER_PULL COLON STRING
  static boolean docker_pull(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docker_pull")) return false;
    if (!nextTokenIs(b, DOCKER_PULL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, DOCKER_PULL, COLON, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CLASS COLON DOCKER_REQUIREMENT  docker_requirement_field +
  static boolean docker_requirement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docker_requirement")) return false;
    if (!nextTokenIs(b, CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CLASS, COLON, DOCKER_REQUIREMENT);
    r = r && docker_requirement_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // docker_requirement_field +
  private static boolean docker_requirement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docker_requirement_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = docker_requirement_field(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!docker_requirement_field(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "docker_requirement_3", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // docker_pull
  // | docker_load
  // | docker_file
  // | docker_import
  // | docker_image_id
  // | docker_output_directory
  static boolean docker_requirement_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "docker_requirement_field")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = docker_pull(b, l + 1);
    if (!r) r = docker_load(b, l + 1);
    if (!r) r = docker_file(b, l + 1);
    if (!r) r = docker_import(b, l + 1);
    if (!r) r = docker_image_id(b, l + 1);
    if (!r) r = docker_output_directory(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ENTRY COLON (STRING | EXPRESSION)
  static boolean entry(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entry")) return false;
    if (!nextTokenIs(b, ENTRY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ENTRY, COLON);
    r = r && entry_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // STRING | EXPRESSION
  private static boolean entry_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entry_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, EXPRESSION);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ENTRYNAME COLON (STRING | EXPRESSION)
  static boolean entryname(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entryname")) return false;
    if (!nextTokenIs(b, ENTRYNAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ENTRYNAME, COLON);
    r = r && entryname_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // STRING | EXPRESSION
  private static boolean entryname_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "entryname_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, EXPRESSION);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TYPE COLON ENUM_TYPE
  static boolean enum_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "enum_type")) return false;
    if (!nextTokenIs(b, TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TYPE, COLON, ENUM_TYPE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ENV_DEF COLON env_name env_value
  static boolean env_def(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "env_def")) return false;
    if (!nextTokenIs(b, ENV_DEF)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ENV_DEF, COLON);
    r = r && env_name(b, l + 1);
    r = r && env_value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ENV_NAME COLON STRING
  static boolean env_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "env_name")) return false;
    if (!nextTokenIs(b, ENV_NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ENV_NAME, COLON, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ENV_VALUE COLON (STRING | EXPRESSION)
  static boolean env_value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "env_value")) return false;
    if (!nextTokenIs(b, ENV_VALUE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ENV_VALUE, COLON);
    r = r && env_value_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // STRING | EXPRESSION
  private static boolean env_value_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "env_value_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, EXPRESSION);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CLASS COLON ENV_VAR_REQUIREMENT  env_def
  static boolean env_var_requirement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "env_var_requirement")) return false;
    if (!nextTokenIs(b, CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CLASS, COLON, ENV_VAR_REQUIREMENT);
    r = r && env_def(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACKET (EXPRESSION COMMA) * EXPRESSION RBRACKET
  static boolean expression_array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_array")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && expression_array_1(b, l + 1);
    r = r && consumeTokens(b, 0, EXPRESSION, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // (EXPRESSION COMMA) *
  private static boolean expression_array_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_array_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!expression_array_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "expression_array_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // EXPRESSION COMMA
  private static boolean expression_array_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "expression_array_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, EXPRESSION, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // " "
  static boolean expression_tool(PsiBuilder b, int l) {
    return consumeToken(b, " ");
  }

  /* ********************************************************** */
  // CLASS COLON FILE_TYPE  file_field +
  public static boolean file_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_")) return false;
    if (!nextTokenIs(b, CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CLASS, COLON, FILE_TYPE);
    r = r && file__3(b, l + 1);
    exit_section_(b, m, FILE_, r);
    return r;
  }

  // file_field +
  private static boolean file__3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file__3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = file_field(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!file_field(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "file__3", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACKET (file COMMA) * file RBRACKET
  public static boolean file_array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_array")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && file_array_1(b, l + 1);
    r = r && consumeTokens(b, 0, FILE, RBRACKET);
    exit_section_(b, m, FILE_ARRAY, r);
    return r;
  }

  // (file COMMA) *
  private static boolean file_array_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_array_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!file_array_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "file_array_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // file COMMA
  private static boolean file_array_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_array_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FILE, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // location | path | basename | dirname | nameroot | nameext | checksum | size | file_secondary_files | format | contents
  public static boolean file_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_field")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FILE_FIELD, "<file field>");
    r = location(b, l + 1);
    if (!r) r = path(b, l + 1);
    if (!r) r = basename(b, l + 1);
    if (!r) r = dirname(b, l + 1);
    if (!r) r = nameroot(b, l + 1);
    if (!r) r = nameext(b, l + 1);
    if (!r) r = checksum(b, l + 1);
    if (!r) r = size(b, l + 1);
    if (!r) r = file_secondary_files(b, l + 1);
    if (!r) r = format(b, l + 1);
    if (!r) r = contents(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // SECONDARY_FILES COLON (file_array | directory_array)
  static boolean file_secondary_files(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_secondary_files")) return false;
    if (!nextTokenIs(b, SECONDARY_FILES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SECONDARY_FILES, COLON);
    r = r && file_secondary_files_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // file_array | directory_array
  private static boolean file_secondary_files_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "file_secondary_files_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = file_array(b, l + 1);
    if (!r) r = directory_array(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FORMAT COLON (STRING | string_array | EXPRESSION)
  static boolean format(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "format")) return false;
    if (!nextTokenIs(b, FORMAT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, FORMAT, COLON);
    r = r && format_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // STRING | string_array | EXPRESSION
  private static boolean format_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "format_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    if (!r) r = string_array(b, l + 1);
    if (!r) r = consumeToken(b, EXPRESSION);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // GLOB COLON (STRING | EXPRESSION | string_array)
  static boolean glob(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "glob")) return false;
    if (!nextTokenIs(b, GLOB)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, GLOB, COLON);
    r = r && glob_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // STRING | EXPRESSION | string_array
  private static boolean glob_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "glob_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, EXPRESSION);
    if (!r) r = string_array(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // HINTS COLON STRING *
  static boolean hints(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hints")) return false;
    if (!nextTokenIs(b, HINTS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, HINTS, COLON);
    r = r && hints_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // STRING *
  private static boolean hints_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "hints_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!consumeToken(b, STRING)) break;
      if (!empty_element_parsed_guard_(b, "hints_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // ID COLON STRING
  static boolean id(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "id")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ID, COLON, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // file_array | directory_array | dirent_array | string_array | expression_array | STRING | EXPRESSION
  public static boolean initial_workdir_listing(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initial_workdir_listing")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INITIAL_WORKDIR_LISTING, "<initial workdir listing>");
    r = file_array(b, l + 1);
    if (!r) r = directory_array(b, l + 1);
    if (!r) r = dirent_array(b, l + 1);
    if (!r) r = string_array(b, l + 1);
    if (!r) r = expression_array(b, l + 1);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, EXPRESSION);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CLASS COLON INITIAL_WORKDIR_REQUIREMENT  initial_workdir_listing
  static boolean initial_workdir_requirement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "initial_workdir_requirement")) return false;
    if (!nextTokenIs(b, CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CLASS, COLON, INITIAL_WORKDIR_REQUIREMENT);
    r = r && initial_workdir_listing(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CLASS COLON INLINE_JAVASCRIPT_REQUIREMENT
  static boolean inline_javascript_requirement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inline_javascript_requirement")) return false;
    if (!nextTokenIs(b, CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CLASS, COLON, INLINE_JAVASCRIPT_REQUIREMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INPUT_BINDING COLON  command_line_binding_field +
  static boolean input_binding(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "input_binding")) return false;
    if (!nextTokenIs(b, INPUT_BINDING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INPUT_BINDING, COLON);
    r = r && input_binding_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // command_line_binding_field +
  private static boolean input_binding_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "input_binding_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = command_line_binding_field(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!command_line_binding_field(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "input_binding_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // INPUTS_TK COLON  command_input_parameter +
  public static boolean inputs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inputs")) return false;
    if (!nextTokenIs(b, INPUTS_TK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INPUTS_TK, COLON);
    r = r && inputs_2(b, l + 1);
    exit_section_(b, m, INPUTS, r);
    return r;
  }

  // command_input_parameter +
  private static boolean inputs_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "inputs_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = command_input_parameter(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!command_input_parameter(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "inputs_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACKET (INT COMMA) * INT RBRACKET
  public static boolean int_array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "int_array")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && int_array_1(b, l + 1);
    r = r && consumeTokens(b, 0, INT, RBRACKET);
    exit_section_(b, m, INT_ARRAY, r);
    return r;
  }

  // (INT COMMA) *
  private static boolean int_array_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "int_array_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!int_array_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "int_array_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // INT COMMA
  private static boolean int_array_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "int_array_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, INT, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ITEM_SEPARATOR COLON STRING
  static boolean item_separator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_separator")) return false;
    if (!nextTokenIs(b, ITEM_SEPARATOR)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, ITEM_SEPARATOR, COLON, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LABEL COLON STRING
  static boolean label(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "label")) return false;
    if (!nextTokenIs(b, LABEL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LABEL, COLON, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LISTING COLON (file_array | directory_array)
  static boolean listing(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listing")) return false;
    if (!nextTokenIs(b, LISTING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LISTING, COLON);
    r = r && listing_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // file_array | directory_array
  private static boolean listing_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "listing_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = file_array(b, l + 1);
    if (!r) r = directory_array(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LOAD_CONTENTS COLON BOOLEAN
  static boolean load_contents(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "load_contents")) return false;
    if (!nextTokenIs(b, LOAD_CONTENTS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LOAD_CONTENTS, COLON, BOOLEAN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LOCATION COLON STRING
  static boolean location(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "location")) return false;
    if (!nextTokenIs(b, LOCATION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, LOCATION, COLON, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NAME COLON STRING
  static boolean name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "name")) return false;
    if (!nextTokenIs(b, NAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NAME, COLON, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NAMEEXT COLON STRING
  static boolean nameext(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nameext")) return false;
    if (!nextTokenIs(b, NAMEEXT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NAMEEXT, COLON, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // NAMEROOT COLON STRING
  static boolean nameroot(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nameroot")) return false;
    if (!nextTokenIs(b, NAMEROOT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, NAMEROOT, COLON, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OUTDIR_MAX COLON (NUMBER | STRING | EXPRESSION)
  static boolean outdir_max(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "outdir_max")) return false;
    if (!nextTokenIs(b, OUTDIR_MAX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OUTDIR_MAX, COLON);
    r = r && outdir_max_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NUMBER | STRING | EXPRESSION
  private static boolean outdir_max_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "outdir_max_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, EXPRESSION);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OUTDIR_MIN COLON (NUMBER | STRING | EXPRESSION)
  static boolean outdir_min(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "outdir_min")) return false;
    if (!nextTokenIs(b, OUTDIR_MIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OUTDIR_MIN, COLON);
    r = r && outdir_min_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NUMBER | STRING | EXPRESSION
  private static boolean outdir_min_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "outdir_min_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, EXPRESSION);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // command_output_binding
  public static boolean output_binding(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "output_binding")) return false;
    if (!nextTokenIs(b, COLON)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = command_output_binding(b, l + 1);
    exit_section_(b, m, OUTPUT_BINDING, r);
    return r;
  }

  /* ********************************************************** */
  // OUTPUT_EVAL COLON (STRING | EXPRESSION)
  static boolean output_eval(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "output_eval")) return false;
    if (!nextTokenIs(b, OUTPUT_EVAL)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OUTPUT_EVAL, COLON);
    r = r && output_eval_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // STRING | EXPRESSION
  private static boolean output_eval_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "output_eval_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, EXPRESSION);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // OUTPUTS COLON  command_output_parameter +
  static boolean outputs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "outputs")) return false;
    if (!nextTokenIs(b, OUTPUTS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, OUTPUTS, COLON);
    r = r && outputs_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // command_output_parameter +
  private static boolean outputs_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "outputs_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = command_output_parameter(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!command_output_parameter(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "outputs_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PACKAGE COLON STRING
  static boolean package_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "package_$")) return false;
    if (!nextTokenIs(b, PACKAGE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PACKAGE, COLON, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // software_package_array
  public static boolean packages(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "packages")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = software_package_array(b, l + 1);
    exit_section_(b, m, PACKAGES, r);
    return r;
  }

  /* ********************************************************** */
  // PATH COLON STRING
  static boolean path(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "path")) return false;
    if (!nextTokenIs(b, PATH)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PATH, COLON, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PERMANENT_FAIL_CODES COLON int_array
  static boolean permanent_fail_codes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "permanent_fail_codes")) return false;
    if (!nextTokenIs(b, PERMANENT_FAIL_CODES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PERMANENT_FAIL_CODES, COLON);
    r = r && int_array(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // POSITION COLON INT
  static boolean position(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "position")) return false;
    if (!nextTokenIs(b, POSITION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, POSITION, COLON, INT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // PREFIX COLON STRING
  static boolean prefix(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "prefix")) return false;
    if (!nextTokenIs(b, PREFIX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, PREFIX, COLON, STRING);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RAM_MAX COLON (NUMBER | STRING | EXPRESSION)
  static boolean ram_max(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ram_max")) return false;
    if (!nextTokenIs(b, RAM_MAX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, RAM_MAX, COLON);
    r = r && ram_max_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NUMBER | STRING | EXPRESSION
  private static boolean ram_max_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ram_max_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, EXPRESSION);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // RAM_MIN COLON (NUMBER | STRING | EXPRESSION)
  static boolean ram_min(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ram_min")) return false;
    if (!nextTokenIs(b, RAM_MIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, RAM_MIN, COLON);
    r = r && ram_min_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NUMBER | STRING | EXPRESSION
  private static boolean ram_min_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ram_min_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, EXPRESSION);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TYPE COLON RECORD
  public static boolean record_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "record_type")) return false;
    if (!nextTokenIs(b, TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TYPE, COLON, RECORD);
    exit_section_(b, m, RECORD_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // inline_javascript_requirement
  // | schema_def_requirement
  // | docker_requirement
  // | software_requirement
  // | initial_workdir_requirement
  // | env_var_requirement
  // | shell_command_requirement
  // | resource_requirement
  public static boolean requirement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requirement")) return false;
    if (!nextTokenIs(b, CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = inline_javascript_requirement(b, l + 1);
    if (!r) r = schema_def_requirement(b, l + 1);
    if (!r) r = docker_requirement(b, l + 1);
    if (!r) r = software_requirement(b, l + 1);
    if (!r) r = initial_workdir_requirement(b, l + 1);
    if (!r) r = env_var_requirement(b, l + 1);
    if (!r) r = shell_command_requirement(b, l + 1);
    if (!r) r = resource_requirement(b, l + 1);
    exit_section_(b, m, REQUIREMENT, r);
    return r;
  }

  /* ********************************************************** */
  // REQUIREMENTS_TK COLON  requirement +
  public static boolean requirements(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requirements")) return false;
    if (!nextTokenIs(b, REQUIREMENTS_TK)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, REQUIREMENTS_TK, COLON);
    r = r && requirements_2(b, l + 1);
    exit_section_(b, m, REQUIREMENTS, r);
    return r;
  }

  // requirement +
  private static boolean requirements_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "requirements_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = requirement(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!requirement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "requirements_2", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CLASS COLON RESOURCE_REQUIREMENT  resource_requirement_field *
  static boolean resource_requirement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "resource_requirement")) return false;
    if (!nextTokenIs(b, CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CLASS, COLON, RESOURCE_REQUIREMENT);
    r = r && resource_requirement_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // resource_requirement_field *
  private static boolean resource_requirement_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "resource_requirement_3")) return false;
    int c = current_position_(b);
    while (true) {
      if (!resource_requirement_field(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "resource_requirement_3", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  /* ********************************************************** */
  // cores_min
  // | cores_max
  // | ram_min
  // | ram_max
  // | tmpdir_min
  // | tmpdir_max
  // | outdir_min
  // | outdir_max
  public static boolean resource_requirement_field(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "resource_requirement_field")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RESOURCE_REQUIREMENT_FIELD, "<resource requirement field>");
    r = cores_min(b, l + 1);
    if (!r) r = cores_max(b, l + 1);
    if (!r) r = ram_min(b, l + 1);
    if (!r) r = ram_max(b, l + 1);
    if (!r) r = tmpdir_min(b, l + 1);
    if (!r) r = tmpdir_max(b, l + 1);
    if (!r) r = outdir_min(b, l + 1);
    if (!r) r = outdir_max(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // CLASS COLON SCHEMA_DEF_REQUIREMENT
  static boolean schema_def_requirement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "schema_def_requirement")) return false;
    if (!nextTokenIs(b, CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CLASS, COLON, SCHEMA_DEF_REQUIREMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SECONDARY_FILES COLON  (STRING | EXPRESSION | string_array | expression_array)
  static boolean secondary_files(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "secondary_files")) return false;
    if (!nextTokenIs(b, SECONDARY_FILES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SECONDARY_FILES, COLON);
    r = r && secondary_files_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // STRING | EXPRESSION | string_array | expression_array
  private static boolean secondary_files_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "secondary_files_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, EXPRESSION);
    if (!r) r = string_array(b, l + 1);
    if (!r) r = expression_array(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SEPARATE COLON BOOLEAN
  static boolean separate(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "separate")) return false;
    if (!nextTokenIs(b, SEPARATE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SEPARATE, COLON, BOOLEAN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CLASS COLON SHELL_COMMAND_REQUIREMENT
  static boolean shell_command_requirement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shell_command_requirement")) return false;
    if (!nextTokenIs(b, CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CLASS, COLON, SHELL_COMMAND_REQUIREMENT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SHELL_QUOTE COLON BOOLEAN
  static boolean shell_quote(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "shell_quote")) return false;
    if (!nextTokenIs(b, SHELL_QUOTE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SHELL_QUOTE, COLON, BOOLEAN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SIZE COLON NUMBER
  static boolean size(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "size")) return false;
    if (!nextTokenIs(b, SIZE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SIZE, COLON, NUMBER);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // package | version | specs
  public static boolean software_package(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "software_package")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SOFTWARE_PACKAGE, "<software package>");
    r = package_$(b, l + 1);
    if (!r) r = version(b, l + 1);
    if (!r) r = specs(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LBRACKET (software_package COMMA) * software_package RBRACKET
  public static boolean software_package_array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "software_package_array")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && software_package_array_1(b, l + 1);
    r = r && software_package(b, l + 1);
    r = r && consumeToken(b, RBRACKET);
    exit_section_(b, m, SOFTWARE_PACKAGE_ARRAY, r);
    return r;
  }

  // (software_package COMMA) *
  private static boolean software_package_array_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "software_package_array_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!software_package_array_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "software_package_array_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // software_package COMMA
  private static boolean software_package_array_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "software_package_array_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = software_package(b, l + 1);
    r = r && consumeToken(b, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // CLASS COLON SOFTWARE_REQUIREMENT  packages
  static boolean software_requirement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "software_requirement")) return false;
    if (!nextTokenIs(b, CLASS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, CLASS, COLON, SOFTWARE_REQUIREMENT);
    r = r && packages(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SPECS COLON string_array
  static boolean specs(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "specs")) return false;
    if (!nextTokenIs(b, SPECS)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SPECS, COLON);
    r = r && string_array(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STRING | EXPRESSION
  static boolean stderr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stderr")) return false;
    if (!nextTokenIs(b, "", EXPRESSION, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, EXPRESSION);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STRING | EXPRESSION
  static boolean stdin(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stdin")) return false;
    if (!nextTokenIs(b, "", EXPRESSION, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, EXPRESSION);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STRING | EXPRESSION
  static boolean stdout(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "stdout")) return false;
    if (!nextTokenIs(b, "", EXPRESSION, STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, EXPRESSION);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // STREAMABLE COLON BOOLEAN
  static boolean streamable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "streamable")) return false;
    if (!nextTokenIs(b, STREAMABLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STREAMABLE, COLON, BOOLEAN);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // LBRACKET (STRING COMMA) * STRING RBRACKET
  static boolean string_array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_array")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, LBRACKET);
    r = r && string_array_1(b, l + 1);
    r = r && consumeTokens(b, 0, STRING, RBRACKET);
    exit_section_(b, m, null, r);
    return r;
  }

  // (STRING COMMA) *
  private static boolean string_array_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_array_1")) return false;
    int c = current_position_(b);
    while (true) {
      if (!string_array_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "string_array_1", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // STRING COMMA
  private static boolean string_array_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_array_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, STRING, COMMA);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // SUCCESS_CODES COLON int_array
  static boolean success_codes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "success_codes")) return false;
    if (!nextTokenIs(b, SUCCESS_CODES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, SUCCESS_CODES, COLON);
    r = r && int_array(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // string_array
  public static boolean symbols(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "symbols")) return false;
    if (!nextTokenIs(b, LBRACKET)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = string_array(b, l + 1);
    exit_section_(b, m, SYMBOLS, r);
    return r;
  }

  /* ********************************************************** */
  // TEMPORARY_FAIL_CODES COLON int_array
  static boolean temporary_fail_codes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "temporary_fail_codes")) return false;
    if (!nextTokenIs(b, TEMPORARY_FAIL_CODES)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TEMPORARY_FAIL_CODES, COLON);
    r = r && int_array(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TMPDIR_MAX COLON (NUMBER | STRING | EXPRESSION)
  static boolean tmpdir_max(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tmpdir_max")) return false;
    if (!nextTokenIs(b, TMPDIR_MAX)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TMPDIR_MAX, COLON);
    r = r && tmpdir_max_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NUMBER | STRING | EXPRESSION
  private static boolean tmpdir_max_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tmpdir_max_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, EXPRESSION);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TMPDIR_MIN COLON (NUMBER | STRING | EXPRESSION)
  static boolean tmpdir_min(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tmpdir_min")) return false;
    if (!nextTokenIs(b, TMPDIR_MIN)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TMPDIR_MIN, COLON);
    r = r && tmpdir_min_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // NUMBER | STRING | EXPRESSION
  private static boolean tmpdir_min_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tmpdir_min_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, EXPRESSION);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // (command_line_tool)
  static boolean tool_description(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "tool_description")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = command_line_tool(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // TYPE COLON STRING_TYPE
  static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    if (!nextTokenIs(b, TYPE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, TYPE, COLON, STRING_TYPE);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VALUE_FROM COLON (STRING | EXPRESSION)
  static boolean value_from(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_from")) return false;
    if (!nextTokenIs(b, VALUE_FROM)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, VALUE_FROM, COLON);
    r = r && value_from_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // STRING | EXPRESSION
  private static boolean value_from_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value_from_2")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, STRING);
    if (!r) r = consumeToken(b, EXPRESSION);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // VERSION COLON string_array
  static boolean version(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "version")) return false;
    if (!nextTokenIs(b, VERSION)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, VERSION, COLON);
    r = r && string_array(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // " "
  static boolean workflow(PsiBuilder b, int l) {
    return consumeToken(b, " ");
  }

  /* ********************************************************** */
  // WRITABLE COLON BOOLEAN
  static boolean writable(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "writable")) return false;
    if (!nextTokenIs(b, WRITABLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokens(b, 0, WRITABLE, COLON, BOOLEAN);
    exit_section_(b, m, null, r);
    return r;
  }

}
