// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.azurenative.botservice.inputs.SmsChannelPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Sms channel definition
 * 
 */
public final class SmsChannelArgs extends io.pulumi.resources.ResourceArgs {

    public static final SmsChannelArgs Empty = new SmsChannelArgs();

    /**
     * The channel name
     * Expected value is 'SmsChannel'.
     * 
     */
    @Import(name="channelName", required=true)
      private final Output<String> channelName;

    public Output<String> getChannelName() {
        return this.channelName;
    }

    /**
     * Entity Tag of the resource
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Output.empty() : this.etag;
    }

    /**
     * Specifies the location of the resource.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The set of properties specific to Sms channel resource
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<SmsChannelPropertiesArgs> properties;

    public Output<SmsChannelPropertiesArgs> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    public SmsChannelArgs(
        Output<String> channelName,
        @Nullable Output<String> etag,
        @Nullable Output<String> location,
        @Nullable Output<SmsChannelPropertiesArgs> properties) {
        this.channelName = Objects.requireNonNull(channelName, "expected parameter 'channelName' to be non-null");
        this.etag = etag;
        this.location = location == null ? Output.ofNullable("global") : location;
        this.properties = properties;
    }

    private SmsChannelArgs() {
        this.channelName = Output.empty();
        this.etag = Output.empty();
        this.location = Output.empty();
        this.properties = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SmsChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> channelName;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> location;
        private @Nullable Output<SmsChannelPropertiesArgs> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(SmsChannelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelName = defaults.channelName;
    	      this.etag = defaults.etag;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
        }

        public Builder channelName(Output<String> channelName) {
            this.channelName = Objects.requireNonNull(channelName);
            return this;
        }

        public Builder channelName(String channelName) {
            this.channelName = Output.of(Objects.requireNonNull(channelName));
            return this;
        }

        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = Output.ofNullable(etag);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder properties(@Nullable Output<SmsChannelPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder properties(@Nullable SmsChannelPropertiesArgs properties) {
            this.properties = Output.ofNullable(properties);
            return this;
        }
        public SmsChannelArgs build() {
            return new SmsChannelArgs(channelName, etag, location, properties);
        }
    }
}
