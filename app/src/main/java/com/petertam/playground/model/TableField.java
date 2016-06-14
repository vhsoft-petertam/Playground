package com.petertam.playground.model;

public class TableField {
    
    // Master Model Tables
    public static final String TABLE_CORPORATE = "CtrmCorporate";
    public static final String TABLE_CORPORATE_FORM = "MtsmCorporateForm";
    public static final String TABLE_CONTRACT = "CtrmContract";
    public static final String TABLE_CONTRACT_USER = "CtrmContractUser";
    public static final String TABLE_SITE = "CtrmSite";
    public static final String TABLE_SITE_LEVEL_LABEL = "CtrmSiteLevelLabel";
    public static final String TABLE_USER = "CtrmUser";
    public static final String TABLE_DEVICE = "CtrmDevice";
    public static final String TABLE_GROUP = "CtrmGroup";
    public static final String TABLE_GROUP_USER = "CtrmGroupUser";
    public static final String TABLE_APPLICATION_ROLE = "CtrmApplicationRole";
    public static final String TABLE_USER_APPLICATION_ROLE = "CtrmUserApplicationRole";
    
    public static final String TABLE_FORM = "MtsmForm";
    public static final String TABLE_FORM_PROGRESS = "MtsmFormProgress";
    public static final String TABLE_FORM_CATEGORY = "MtsmFormCategory";
    public static final String TABLE_SUBCONTRACTOR = "MtsmSubcontractor";
    public static final String TABLE_SUBCONTRACTOR_USER = "MtsmSubcontractorUser";
    
    public static final String TABLE_PROGRESS_NOTIFY_ROLE = "MtsmProgressNotifyRole";
    
    public static final String TABLE_FORM_SECTION = "MtsmFormSection";
    public static final String TABLE_FORM_SECTION_PROGRESS = "MtsmFormSectionProgress";
    public static final String TABLE_FORM_ITEM = "MtsmFormItem";
    public static final String TABLE_FORM_ITME_OPTION_GROUP = "MtsmFormItemOptionGroup";
    public static final String TABLE_FORM_ITEM_OPTION = "MtsmFormItemOption";
    
    public static final String TABLE_PROGRESS = "MtsmProgress";
    
    public static final String TABLE_WORKER_TYPE = "MtsmWorkerType";
    
    public static final String TABLE_WORKER = "SftmWorker";
    public static final String TABLE_CERT = "SftmCert";
    public static final String TABLE_WORKER_CERT = "SftmWorkerCert";
    
    // Transaction Model Tables
    public static final String TABLE_MATERIAL_TRACK = "MtstMaterialTrack";
    public static final String TABLE_MATERIAL_TRACK_SECTION_ITEM_VALUE_GROUP = "MtstMaterialTrackSectionItemValueGroup";
    public static final String TABLE_MATERIAL_TRACK_ITEM_VALUE = "MtstMaterialTrackItemValue";
    public static final String TABLE_MATERIAL_TRACK_WORKER = "MtstMaterialTrackWorker";
    public static final String TABLE_MATERIAL_TRACK_PROGRESS = "MtstMaterialTrackProgress";
    public static final String TABLE_MATERIAL_TRACK_PROGRESS_CAPTURE = "MtstMaterialTrackProgressCapture";
    public static final String TABLE_MATERIAL_TRACK_NOTIFY_GROUP = "MtstMaterialTrackNotifyGroup";
    
    // Base Field
    public static final String DELETE = "bDelete";
    public static final String UPDATED_TYPE = "sUpdatedType";
    public static final String UPDATED_BY = "sUpdatedBy";
    public static final String UPDATED_DATE = "dUpdatedDate";
    public static final String CREATED_BY = "dCreatedBy";
    public static final String CREATED_DATE = "dCreatedDate";
    
    
    public static final String GID = "gID";
    
    public static final String NSEQUENCE = "nSequence";
    
    public static final String CORPORATE_ID = "gCorporateID";
    public static final String CORPORATE_FORM_ID = "gCorporateFormID";
    public static final String CONTRACT_ID = "gContractID";
    
    public static final String GROUP_ID = "gGroupID";
    public static final String GROUP_NAME = "sGroupName";
    
    public static final String FORM_CATEGORY_ID = "gFormCategoryID";
    public static final String FORM_SECTION_ID = "gFormSectionID";
    public static final String FORM_ITEM_ID = "gFormItemID";
    public static final String MATERIAL_TRACK_SECTION_ITEM_VALUE_GROUP_ID = "gMaterialTrackSectionItemValueGroupID";
    public static final String FORM_ID = "gFormID";
    
    public static final String FORM_ITEM_OPTION_GROUP_ID = "gFormItemOptionGroupID";
    
    public static final String PROGRESS_ID = "gProgressID";
    
    public static final String SEQUENCE = "nSequence";
    
    public static final String AUTHOR_CORPORATE_ID = "gAuthorCorporateID";
    
    public static final String MATERIAL_TRACK_ID = "gMaterialTrackID";
    public static final String MATERIAL_TRACK_PROGRESS_ID = "gMaterialTrackProgressID";
    
    public static final String SUBCONTRACTOR_ID = "gSubcontractorID";
    
    public static final String PHOTO_PATH = "sPhotoPath";
    
    public static final String WORKER_ID = "gWorkerID";
    public static final String WORKER_TYPE_ID = "gWorkerTypeID";
    
    public static final String WORKER_IMAGE_PATH = "sWorkerImagePath";

    public static final String OPTION_ID = "gOptionID";
    
    public static final String USER_ID = "gUserID";
    
    public static final String APPLICATION_ROLE_ID = "gApplicationRoleID";
    
    public static final String NAME = "sName";
    
    public static final String PARENT_SITE_ID = "gParentSiteID";
    
    public static final String SITE_ID = "gSiteID";
    
    public static final String LEVEL = "nLevel";
    
    public static final String TAG_VALUE = "sTagValue";
    
    public static final String CWRA_CARD_SERIAL_NUM = "sCwraCardSerialNum";
    
    public static final String SAFETY_CARD_NUM = "sSafetyCardNum";
    
    public static final String BSYNC = "bSync";
    
    public static final String BSIGNIMAGESYNC = "bSignImageSync";
    
    public static final String BPHOTOSYNC = "bPhotoSync";
    
    public static final String CARD_NUM = "sCardNum";
    public static final String SERIAL_NUM = "sSerialNum";
    
    public static final String LAST_NAME = "sLastName";
    
    public static final String SIGN_PATH = "sSignPath";
    public static final String IN_PROGRESS = "bInProgress";
    public static final String PROGRESS_SEQ_NUM = "nProgressSeqNum";
    
    public static final String BDISPLAY_CARD = "bDisplayCard";
    public static final String BDISPLAY_SIGN = "bDisplaySign";
    public static final String BREQUIRE_SIGN = "bRequireSign";
    
    public static final String BWEB_ENTRY = "bWebEntry";
    
    public static final String REF_SERIAL = "sRefSerial";
    
    public static final String ICON_PATH = "sIconPath";
    
    public static final String BOOKMARK_DATE = "dBookMarkDate";
    
    public static final String BBOOKMARK = "bBookMark";
    
    public static final String DACTIONDATE = "dActionDate";
    
}
