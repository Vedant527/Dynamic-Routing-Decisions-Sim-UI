"GBS Debit Routing Intern Project Summer 2020\n" +
"Interns: Vedant Bhat & Rakesh Gorrepati\n" +
"Mentor: Eric Poliashenko\n" +
"\n" +
"About: A simple gui tool which allows for queries to the DRD and provides capability for groups, who work with the DRD, \n" +
"       to quickly receive a pseudo-response from DRD without having to do all the extra work/time to acquire it through\n" +
"       its normally tedious process. The gui also allows for persistence, i.e. user's inputted values will save after\n" +
"       closing the application, granted that \"clear\" was not used.\n" +
"\n" +
"Tech Stack: Java & JavaFX\n" +
"\n" +
"Instructions:\n" +
"    *Merchant\n" +
"        *Enter Merchant ID\n" +
"        *Fill out NWID(s) from left to right, without leaving empty text fields in between NWIDs\n" +
"    *Bin\n" +
"        *Enter BIN#\n" +
"        *Enter PAN Length\n" +
"        *Enter NWID and Capability Tag\n" +
"            *Capabilities include : P = Pinned\n" +
"                                    L = Billpay-Pinless\n" +
"                                    B = Pinned/Billpay-Pinless\n" +
"                                    A = POS-Pinless\n" +
"                                    C = Billpay-Pinless/POS-Pinless\n" +
"                                    D = Pinned/POS-Pinless\n" +
"                                    E = Pinned/Billpay-Pinless/POS-Pinless\n" +
"                                    F = Signature Debit\n" +
"                                    X = Ecommerce Only\n" +
"            * Format : NWID+CAPA\n" +
"                       41E\n" +
"                       30L\n" +
"    *Buckets\n" +
"        *Enter Min and Max\n" +
"        *Enter NWID(s) : In the order of NWID1, NWID2, NWID3, NWID4\n" +
"\t*Minimum required fields:\n" +
"\t    * Merchant ID and 1 associated NWID\n" +
"\t    * 1 Bin# and 1 associated NWID\n" +
"\t    * 1 Bucket and associated NWID\n" +
"\t    * Host & Port\n" +
"\n" +
"Acronyms:\n" +
"\t*MID# : Merchant ID number, a numerical value\n" +
"\t*MID NWID : Network ID associated with the merchant id number\n" +
"\t*PAN Length : Numerical value\n" +
"\t*BIN# : Numerical value\n" +
"\t*BIN NWID : Network ID and Capability Tag, e.g. 41,E\n" +
"\t*Bucket Min : Numerical value, must be less than associated max\n" +
"\t*Bucket Max : Numerical value, must be less than associated min\n" +
"\t*Bucket NWID : Network ID associated with the Bucket\n" +
"\t*Host & Port : DRD related information, where the query will be sent to form the GUI\n" +
"\t*NWID(s) : Any integer between 0 - 74\n" +
"\n" +
"Buttons:\n" +
"    *Clear : Sends clear request to DRD, clears all text fields in gui.\n" +
"    *Build : Sends query to DRD. Given that there are no errors and minimum required fields are fill out.\n" +
"    *Add(\"+\") : Adds text fields\n" +
"    *Delete(\"-\") : Removes text fields\n" +
"\n"

