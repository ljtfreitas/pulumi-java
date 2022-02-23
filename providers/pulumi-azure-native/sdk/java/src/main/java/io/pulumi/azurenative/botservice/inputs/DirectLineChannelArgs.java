// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.azurenative.botservice.inputs.DirectLineChannelPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Direct Line channel definition
 * 
 */
public final class DirectLineChannelArgs extends io.pulumi.resources.ResourceArgs {

    public static final DirectLineChannelArgs Empty = new DirectLineChannelArgs();

    /**
     * The channel name
     * Expected value is 'DirectLineChannel'.
     * 
     */
    @InputImport(name="channelName", required=true)
        private final Input<String> channelName;

    public Input<String> getChannelName() {
        return this.channelName;
    }

    /**
     * Entity Tag of the resource
     * 
     */
    @InputImport(name="etag")
        private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * Specifies the location of the resource.
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The set of properties specific to Direct Line channel resource
     * 
     */
    @InputImport(name="properties")
        private final @Nullable Input<DirectLineChannelPropertiesArgs> properties;

    public Input<DirectLineChannelPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    public DirectLineChannelArgs(
        Input<String> channelName,
        @Nullable Input<String> etag,
        @Nullable Input<String> location,
        @Nullable Input<DirectLineChannelPropertiesArgs> properties) {
        this.channelName = Objects.requireNonNull(channelName, "expected parameter 'channelName' to be non-null");
        this.etag = etag;
        this.location = location == null ? Input.ofNullable("global") : location;
        this.properties = properties;
    }

    private DirectLineChannelArgs() {
        this.channelName = Input.empty();
        this.etag = Input.empty();
        this.location = Input.empty();
        this.properties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectLineChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> channelName;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> location;
        private @Nullable Input<DirectLineChannelPropertiesArgs> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(DirectLineChannelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelName = defaults.channelName;
    	      this.etag = defaults.etag;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
        }

        public Builder setChannelName(Input<String> channelName) {
            this.channelName = Objects.requireNonNull(channelName);
            return this;
        }

        public Builder setChannelName(String channelName) {
            this.channelName = Input.of(Objects.requireNonNull(channelName));
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setProperties(@Nullable Input<DirectLineChannelPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable DirectLineChannelPropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }
        public DirectLineChannelArgs build() {
            return new DirectLineChannelArgs(channelName, etag, location, properties);
        }
    }
}
