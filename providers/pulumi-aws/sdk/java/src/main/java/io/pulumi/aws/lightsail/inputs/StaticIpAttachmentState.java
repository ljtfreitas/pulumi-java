// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lightsail.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StaticIpAttachmentState extends io.pulumi.resources.ResourceArgs {

    public static final StaticIpAttachmentState Empty = new StaticIpAttachmentState();

    /**
     * The name of the Lightsail instance to attach the IP to
     * 
     */
    @InputImport(name="instanceName")
    private final @Nullable Input<String> instanceName;

    public Input<String> getInstanceName() {
        return this.instanceName == null ? Input.empty() : this.instanceName;
    }

    /**
     * The allocated static IP address
     * 
     */
    @InputImport(name="ipAddress")
    private final @Nullable Input<String> ipAddress;

    public Input<String> getIpAddress() {
        return this.ipAddress == null ? Input.empty() : this.ipAddress;
    }

    /**
     * The name of the allocated static IP
     * 
     */
    @InputImport(name="staticIpName")
    private final @Nullable Input<String> staticIpName;

    public Input<String> getStaticIpName() {
        return this.staticIpName == null ? Input.empty() : this.staticIpName;
    }

    public StaticIpAttachmentState(
        @Nullable Input<String> instanceName,
        @Nullable Input<String> ipAddress,
        @Nullable Input<String> staticIpName) {
        this.instanceName = instanceName;
        this.ipAddress = ipAddress;
        this.staticIpName = staticIpName;
    }

    private StaticIpAttachmentState() {
        this.instanceName = Input.empty();
        this.ipAddress = Input.empty();
        this.staticIpName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticIpAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> instanceName;
        private @Nullable Input<String> ipAddress;
        private @Nullable Input<String> staticIpName;

        public Builder() {
    	      // Empty
        }

        public Builder(StaticIpAttachmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceName = defaults.instanceName;
    	      this.ipAddress = defaults.ipAddress;
    	      this.staticIpName = defaults.staticIpName;
        }

        public Builder setInstanceName(@Nullable Input<String> instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        public Builder setInstanceName(@Nullable String instanceName) {
            this.instanceName = Input.ofNullable(instanceName);
            return this;
        }

        public Builder setIpAddress(@Nullable Input<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = Input.ofNullable(ipAddress);
            return this;
        }

        public Builder setStaticIpName(@Nullable Input<String> staticIpName) {
            this.staticIpName = staticIpName;
            return this;
        }

        public Builder setStaticIpName(@Nullable String staticIpName) {
            this.staticIpName = Input.ofNullable(staticIpName);
            return this;
        }
        public StaticIpAttachmentState build() {
            return new StaticIpAttachmentState(instanceName, ipAddress, staticIpName);
        }
    }
}
