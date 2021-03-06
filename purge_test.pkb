CREATE OR REPLACE PACKAGE BODY test IS
/*
 * File documentation goes here.  This is required for the outline to work correctly.
 *
 * Below here are the details for the header.  This is verbatim generated into the header file.
 * The verbatim copying starts below the line with the word "header" and the word "details" next
 * to each other.  You should not put those words together anywhere else in this file documentation
 * section.  This would cause the outline parser (and auto completion parser) to fail.
 * header details
   gc_package_name CONSTANT VARCHAR2(50) := 'purge_test.pkb';
 * end header details
 * The line above (with the header's details ending mentioned) indicates the end of
 * the verbatim copying.
 *
 * @authid CURRENT_USER
 *   ^   ^   ^
 * The line above allows the package header generator to correctly generate the
 * command CREATE OR REPLACE PACKAGE test
 *         AS
 *         AUTHID CURRENT_USER
 * @schema purge
 */
 
/**
 * This is a test file.  This part of the documentation is generated as a package header
 * when using pldoc generation.  This is indicated by the use of the headcom tag below.
 *
 * @headcom
 */
 
   /**
    * This is a generic pl doc method documentation.  It is auto generated by the typing of
    * the "/**" and pressing enter.
    * There is also auto completion of tags within this section, auto completion of parameters
    * when using content assist after the word "@param" and standard code auto completion after
    * "@refer", "@see" and "{@link".
    * Using html tags is <b>highlighted</b> (as seen by the bold markers).
    *
    * @param pin_object_id the object id of this call.
    * The above param tag can have auto complete (Ctrl-Space) applied to it to generate any of the
    * parameters in the declared method.
    *
    * @param pin_traversal_context_id a dummy number
    *
    * @see do_something(NUMBER, VARCHAR2);
    * The above see tag can have auto complete (Ctrl-Space) applied to it to generate standard
    * auto complete functionality.
    * 
    * @pragma RESTRICT_REFERENCES( traverse, WNDS, WNPS, RNDS)
    *   ^   ^   ^
    * The line above allows the package header generator to correctly generate the command
    * PRAGMA RESTRICT_REFERENCES(traverse, WNDS, WNPS, RNDS);
    * This pragma should ALWAYS be on one line, and should not have a semi colon after it
    * 
    * @return something useful to someone hopefully
    */
FUNCTION traverse(
    pin_object_id  IN NUMBER,
    pin_traversalcontext_id IN NUMBER)
RETURN NUMBER
AS
    ln_number NUMBER;
    ls_val    VARCHAR2(100);
BEGIN
    ls_val := gc_package_name;
    dbms_output.put_line(pin_object_id);
    -- if you hover over the ^^^ pin_object_id above, it will produce the documentation from the
    -- @param pldoc tag in the pl doc section of this method.
    ln_number :=         do_something(pin_obj => ln_number, pin_extra => 'extra');
    -- if you hover over the ^^^ do_something above, it will produce the documentation from the
    -- pl doc for the do_something below.  This documentation will also work for documentation
    -- from other packages.
    RETURN ln_number;
END traverse;

/**
 * This method will be private because of the use of the "@private" tag,
 * so it will not appear in the header file, but it will have pl doc
 * documentation generated.
 *
 * TODO <-- this will appear in the task list as a medium priority task
 *
 * FIXME <-- this will appear in the task list as a high priority task
 *
 * @param pin_obj The id of the object to operate on.
 * @param pin_extra
 * @return NUMBER
 *
 * @private
 */
FUNCTION do_something(pin_obj IN NUMBER,
                      pin_extra IN VARCHAR2)
                       RETURN NUMBER IS
BEGIN
	RETURN 0;
END do_something;
/*
 * This method will not be in the header file, and will not have pl documentation generated
 * because is has only one star after the opening slash.
 * @return VARCHAR2 (useless, because this won't be pl doc'ed.
 */
FUNCTION get_name RETURN VARCHAR2 IS
BEGIN
    RETURN gc_class_name;
END get_name;
END test;
/
SHOW ERRORS PACKAGE BODY test;
