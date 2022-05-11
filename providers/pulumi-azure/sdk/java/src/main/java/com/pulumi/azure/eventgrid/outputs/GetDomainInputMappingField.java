// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventgrid.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetDomainInputMappingField {
    /**
     * @return Specifies the default data version of the EventGrid Event associated with the domain.
     * 
     */
    private final String dataVersion;
    /**
     * @return Specifies the event time of the EventGrid Event associated with the domain.
     * 
     */
    private final String eventTime;
    /**
     * @return Specifies the default event type of the EventGrid Event associated with the domain.
     * 
     */
    private final String eventType;
    /**
     * @return Specifies the id of the EventGrid Event associated with the domain.
     * 
     */
    private final String id;
    /**
     * @return Specifies the default subject of the EventGrid Event associated with the domain.
     * 
     */
    private final String subject;
    /**
     * @return Specifies the topic of the EventGrid Event associated with the domain.
     * 
     */
    private final String topic;

    @CustomType.Constructor
    private GetDomainInputMappingField(
        @CustomType.Parameter("dataVersion") String dataVersion,
        @CustomType.Parameter("eventTime") String eventTime,
        @CustomType.Parameter("eventType") String eventType,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("subject") String subject,
        @CustomType.Parameter("topic") String topic) {
        this.dataVersion = dataVersion;
        this.eventTime = eventTime;
        this.eventType = eventType;
        this.id = id;
        this.subject = subject;
        this.topic = topic;
    }

    /**
     * @return Specifies the default data version of the EventGrid Event associated with the domain.
     * 
     */
    public String dataVersion() {
        return this.dataVersion;
    }
    /**
     * @return Specifies the event time of the EventGrid Event associated with the domain.
     * 
     */
    public String eventTime() {
        return this.eventTime;
    }
    /**
     * @return Specifies the default event type of the EventGrid Event associated with the domain.
     * 
     */
    public String eventType() {
        return this.eventType;
    }
    /**
     * @return Specifies the id of the EventGrid Event associated with the domain.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Specifies the default subject of the EventGrid Event associated with the domain.
     * 
     */
    public String subject() {
        return this.subject;
    }
    /**
     * @return Specifies the topic of the EventGrid Event associated with the domain.
     * 
     */
    public String topic() {
        return this.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainInputMappingField defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dataVersion;
        private String eventTime;
        private String eventType;
        private String id;
        private String subject;
        private String topic;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainInputMappingField defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataVersion = defaults.dataVersion;
    	      this.eventTime = defaults.eventTime;
    	      this.eventType = defaults.eventType;
    	      this.id = defaults.id;
    	      this.subject = defaults.subject;
    	      this.topic = defaults.topic;
        }

        public Builder dataVersion(String dataVersion) {
            this.dataVersion = Objects.requireNonNull(dataVersion);
            return this;
        }
        public Builder eventTime(String eventTime) {
            this.eventTime = Objects.requireNonNull(eventTime);
            return this;
        }
        public Builder eventType(String eventType) {
            this.eventType = Objects.requireNonNull(eventType);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder subject(String subject) {
            this.subject = Objects.requireNonNull(subject);
            return this;
        }
        public Builder topic(String topic) {
            this.topic = Objects.requireNonNull(topic);
            return this;
        }        public GetDomainInputMappingField build() {
            return new GetDomainInputMappingField(dataVersion, eventTime, eventType, id, subject, topic);
        }
    }
}
