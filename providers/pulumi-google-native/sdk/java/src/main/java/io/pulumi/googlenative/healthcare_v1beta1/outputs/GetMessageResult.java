// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.ParsedDataResponse;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.PatientIdResponse;
import io.pulumi.googlenative.healthcare_v1beta1.outputs.SchematizedDataResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetMessageResult {
    /**
     * The datetime when the message was created. Set by the server.
     * 
     */
    private final String createTime;
    /**
     * Raw message bytes.
     * 
     */
    private final String data;
    /**
     * User-supplied key-value pairs used to organize HL7v2 stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
     * 
     */
    private final Map<String,String> labels;
    /**
     * The message type for this message. MSH-9.1.
     * 
     */
    private final String messageType;
    /**
     * Resource name of the Message, of the form `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7_v2_store_id}/messages/{message_id}`. Assigned by the server.
     * 
     */
    private final String name;
    /**
     * The parsed version of the raw message data.
     * 
     */
    private final ParsedDataResponse parsedData;
    /**
     * All patient IDs listed in the PID-2, PID-3, and PID-4 segments of this message.
     * 
     */
    private final List<PatientIdResponse> patientIds;
    /**
     * The parsed version of the raw message data schematized according to this store's schemas and type definitions.
     * 
     */
    private final SchematizedDataResponse schematizedData;
    /**
     * The hospital that this message came from. MSH-4.
     * 
     */
    private final String sendFacility;
    /**
     * The datetime the sending application sent this message. MSH-7.
     * 
     */
    private final String sendTime;

    @OutputCustomType.Constructor({"createTime","data","labels","messageType","name","parsedData","patientIds","schematizedData","sendFacility","sendTime"})
    private GetMessageResult(
        String createTime,
        String data,
        Map<String,String> labels,
        String messageType,
        String name,
        ParsedDataResponse parsedData,
        List<PatientIdResponse> patientIds,
        SchematizedDataResponse schematizedData,
        String sendFacility,
        String sendTime) {
        this.createTime = Objects.requireNonNull(createTime);
        this.data = Objects.requireNonNull(data);
        this.labels = Objects.requireNonNull(labels);
        this.messageType = Objects.requireNonNull(messageType);
        this.name = Objects.requireNonNull(name);
        this.parsedData = Objects.requireNonNull(parsedData);
        this.patientIds = Objects.requireNonNull(patientIds);
        this.schematizedData = Objects.requireNonNull(schematizedData);
        this.sendFacility = Objects.requireNonNull(sendFacility);
        this.sendTime = Objects.requireNonNull(sendTime);
    }

    /**
     * The datetime when the message was created. Set by the server.
     * 
     */
    public String getCreateTime() {
        return this.createTime;
    }
    /**
     * Raw message bytes.
     * 
     */
    public String getData() {
        return this.data;
    }
    /**
     * User-supplied key-value pairs used to organize HL7v2 stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62} Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63} No more than 64 labels can be associated with a given store.
     * 
     */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * The message type for this message. MSH-9.1.
     * 
     */
    public String getMessageType() {
        return this.messageType;
    }
    /**
     * Resource name of the Message, of the form `projects/{project_id}/datasets/{dataset_id}/hl7V2Stores/{hl7_v2_store_id}/messages/{message_id}`. Assigned by the server.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The parsed version of the raw message data.
     * 
     */
    public ParsedDataResponse getParsedData() {
        return this.parsedData;
    }
    /**
     * All patient IDs listed in the PID-2, PID-3, and PID-4 segments of this message.
     * 
     */
    public List<PatientIdResponse> getPatientIds() {
        return this.patientIds;
    }
    /**
     * The parsed version of the raw message data schematized according to this store's schemas and type definitions.
     * 
     */
    public SchematizedDataResponse getSchematizedData() {
        return this.schematizedData;
    }
    /**
     * The hospital that this message came from. MSH-4.
     * 
     */
    public String getSendFacility() {
        return this.sendFacility;
    }
    /**
     * The datetime the sending application sent this message. MSH-7.
     * 
     */
    public String getSendTime() {
        return this.sendTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMessageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private String data;
        private Map<String,String> labels;
        private String messageType;
        private String name;
        private ParsedDataResponse parsedData;
        private List<PatientIdResponse> patientIds;
        private SchematizedDataResponse schematizedData;
        private String sendFacility;
        private String sendTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMessageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.data = defaults.data;
    	      this.labels = defaults.labels;
    	      this.messageType = defaults.messageType;
    	      this.name = defaults.name;
    	      this.parsedData = defaults.parsedData;
    	      this.patientIds = defaults.patientIds;
    	      this.schematizedData = defaults.schematizedData;
    	      this.sendFacility = defaults.sendFacility;
    	      this.sendTime = defaults.sendTime;
        }

        public Builder setCreateTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }

        public Builder setData(String data) {
            this.data = Objects.requireNonNull(data);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setMessageType(String messageType) {
            this.messageType = Objects.requireNonNull(messageType);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParsedData(ParsedDataResponse parsedData) {
            this.parsedData = Objects.requireNonNull(parsedData);
            return this;
        }

        public Builder setPatientIds(List<PatientIdResponse> patientIds) {
            this.patientIds = Objects.requireNonNull(patientIds);
            return this;
        }

        public Builder setSchematizedData(SchematizedDataResponse schematizedData) {
            this.schematizedData = Objects.requireNonNull(schematizedData);
            return this;
        }

        public Builder setSendFacility(String sendFacility) {
            this.sendFacility = Objects.requireNonNull(sendFacility);
            return this;
        }

        public Builder setSendTime(String sendTime) {
            this.sendTime = Objects.requireNonNull(sendTime);
            return this;
        }
        public GetMessageResult build() {
            return new GetMessageResult(createTime, data, labels, messageType, name, parsedData, patientIds, schematizedData, sendFacility, sendTime);
        }
    }
}
