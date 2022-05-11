// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventhub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainInputMappingDefaultValuesArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainInputMappingDefaultValuesArgs Empty = new DomainInputMappingDefaultValuesArgs();

    /**
     * Specifies the default data version of the EventGrid Event to associate with the domain. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="dataVersion")
    private @Nullable Output<String> dataVersion;

    /**
     * @return Specifies the default data version of the EventGrid Event to associate with the domain. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> dataVersion() {
        return Optional.ofNullable(this.dataVersion);
    }

    /**
     * Specifies the default event type of the EventGrid Event to associate with the domain. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="eventType")
    private @Nullable Output<String> eventType;

    /**
     * @return Specifies the default event type of the EventGrid Event to associate with the domain. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> eventType() {
        return Optional.ofNullable(this.eventType);
    }

    /**
     * Specifies the default subject of the EventGrid Event to associate with the domain. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="subject")
    private @Nullable Output<String> subject;

    /**
     * @return Specifies the default subject of the EventGrid Event to associate with the domain. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> subject() {
        return Optional.ofNullable(this.subject);
    }

    private DomainInputMappingDefaultValuesArgs() {}

    private DomainInputMappingDefaultValuesArgs(DomainInputMappingDefaultValuesArgs $) {
        this.dataVersion = $.dataVersion;
        this.eventType = $.eventType;
        this.subject = $.subject;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainInputMappingDefaultValuesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainInputMappingDefaultValuesArgs $;

        public Builder() {
            $ = new DomainInputMappingDefaultValuesArgs();
        }

        public Builder(DomainInputMappingDefaultValuesArgs defaults) {
            $ = new DomainInputMappingDefaultValuesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataVersion Specifies the default data version of the EventGrid Event to associate with the domain. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder dataVersion(@Nullable Output<String> dataVersion) {
            $.dataVersion = dataVersion;
            return this;
        }

        /**
         * @param dataVersion Specifies the default data version of the EventGrid Event to associate with the domain. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder dataVersion(String dataVersion) {
            return dataVersion(Output.of(dataVersion));
        }

        /**
         * @param eventType Specifies the default event type of the EventGrid Event to associate with the domain. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder eventType(@Nullable Output<String> eventType) {
            $.eventType = eventType;
            return this;
        }

        /**
         * @param eventType Specifies the default event type of the EventGrid Event to associate with the domain. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder eventType(String eventType) {
            return eventType(Output.of(eventType));
        }

        /**
         * @param subject Specifies the default subject of the EventGrid Event to associate with the domain. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subject(@Nullable Output<String> subject) {
            $.subject = subject;
            return this;
        }

        /**
         * @param subject Specifies the default subject of the EventGrid Event to associate with the domain. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder subject(String subject) {
            return subject(Output.of(subject));
        }

        public DomainInputMappingDefaultValuesArgs build() {
            return $;
        }
    }

}
