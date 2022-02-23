// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda.inputs;

import io.pulumi.awsnative.lambda.enums.EventSourceMappingSourceAccessConfigurationType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration used by AWS Lambda to access event source
 * 
 */
public final class EventSourceMappingSourceAccessConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventSourceMappingSourceAccessConfigurationArgs Empty = new EventSourceMappingSourceAccessConfigurationArgs();

    /**
     * The type of source access configuration.
     * 
     */
    @InputImport(name="type")
        private final @Nullable Input<EventSourceMappingSourceAccessConfigurationType> type;

    public Input<EventSourceMappingSourceAccessConfigurationType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * The URI for the source access configuration resource.
     * 
     */
    @InputImport(name="uRI")
        private final @Nullable Input<String> uRI;

    public Input<String> getURI() {
        return this.uRI == null ? Input.empty() : this.uRI;
    }

    public EventSourceMappingSourceAccessConfigurationArgs(
        @Nullable Input<EventSourceMappingSourceAccessConfigurationType> type,
        @Nullable Input<String> uRI) {
        this.type = type;
        this.uRI = uRI;
    }

    private EventSourceMappingSourceAccessConfigurationArgs() {
        this.type = Input.empty();
        this.uRI = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSourceMappingSourceAccessConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<EventSourceMappingSourceAccessConfigurationType> type;
        private @Nullable Input<String> uRI;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSourceMappingSourceAccessConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.uRI = defaults.uRI;
        }

        public Builder setType(@Nullable Input<EventSourceMappingSourceAccessConfigurationType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable EventSourceMappingSourceAccessConfigurationType type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setURI(@Nullable Input<String> uRI) {
            this.uRI = uRI;
            return this;
        }

        public Builder setURI(@Nullable String uRI) {
            this.uRI = Input.ofNullable(uRI);
            return this;
        }
        public EventSourceMappingSourceAccessConfigurationArgs build() {
            return new EventSourceMappingSourceAccessConfigurationArgs(type, uRI);
        }
    }
}
