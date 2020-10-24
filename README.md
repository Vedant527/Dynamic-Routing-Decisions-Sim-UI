GBS Debit Routing Intern Project Summer 2020
Interns: Vedant Bhat & Rakesh Gorrepati
Mentor: Eric Poliashenko

Note: Open Instruction page to view with proper formatting


About: A GUI tool which allows for queries to the DRD and provides capability for groups, who work with the DRD, 
       to quickly receive a pseudo-response from DRD without having to do all the extra work/time to acquire it through
       its normally tedious process. The gui also allows for persistence, i.e. user's inputted values will save after
       closing the application, granted that "clear" was not used.

Tech Stack: Java & JavaFX

Instructions:
    *Merchant
        *Enter Merchant ID
        *Fill out NWID(s) from left to right, without leaving empty text fields in between NWIDs
    *Bin
        *Enter BIN#
        *Enter PAN Length
        *Enter NWID and Capability Tag
            *Capabilities include : P = Pinned
                                    L = Billpay-Pinless
                                    B = Pinned/Billpay-Pinless
                                    A = POS-Pinless
                                    C = Billpay-Pinless/POS-Pinless
                                    D = Pinned/POS-Pinless
                                    E = Pinned/Billpay-Pinless/POS-Pinless
                                    F = Signature Debit
                                    X = Ecommerce Only
            * Format : NWID+CAPA
                       41E
                       30L
    *Buckets
        *Enter Min and Max
        *Enter NWID(s) : In the order of NWID1, NWID2, NWID3, NWID4
	*Minimum required fields:
	    * Merchant ID and 1 associated NWID
	    * 1 Bin# and 1 associated NWID
	    * 1 Bucket and associated NWID
	    * Host & Port

Acronyms:
	*MID# : Merchant ID number, a numerical value
	*MID NWID : Network ID associated with the merchant id number
	*PAN Length : Numerical value
	*BIN# : Numerical value
	*BIN NWID : Network ID and Capability Tag, e.g. 41,E
	*Bucket Min : Numerical value, must be less than associated max
	*Bucket Max : Numerical value, must be less than associated min
	*Bucket NWID : Network ID associated with the Bucket
	*Host & Port : DRD related information, where the query will be sent to form the GUI
	*NWID(s) : Any integer between 0 - 74

Buttons:
    *Clear : Sends clear request to DRD, clears all text fields in gui.
    *Build : Sends query to DRD. Given that there are no errors and minimum required fields are fill out.
    *Add("+") : Adds text fields
    *Delete("-") : Removes text fields




