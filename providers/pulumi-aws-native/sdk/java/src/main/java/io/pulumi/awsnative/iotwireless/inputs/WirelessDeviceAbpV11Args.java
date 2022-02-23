// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.inputs;

import io.pulumi.awsnative.iotwireless.inputs.WirelessDeviceSessionKeysAbpV11Args;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class WirelessDeviceAbpV11Args extends io.pulumi.resources.ResourceArgs {

    public static final WirelessDeviceAbpV11Args Empty = new WirelessDeviceAbpV11Args();

    @InputImport(name="devAddr", required=true)
        private final Input<String> devAddr;

    public Input<String> getDevAddr() {
        return this.devAddr;
    }

    @InputImport(name="sessionKeys", required=true)
        private final Input<WirelessDeviceSessionKeysAbpV11Args> sessionKeys;

    public Input<WirelessDeviceSessionKeysAbpV11Args> getSessionKeys() {
        return this.sessionKeys;
    }

    public WirelessDeviceAbpV11Args(
        Input<String> devAddr,
        Input<WirelessDeviceSessionKeysAbpV11Args> sessionKeys) {
        this.devAddr = Objects.requireNonNull(devAddr, "expected parameter 'devAddr' to be non-null");
        this.sessionKeys = Objects.requireNonNull(sessionKeys, "expected parameter 'sessionKeys' to be non-null");
    }

    private WirelessDeviceAbpV11Args() {
        this.devAddr = Input.empty();
        this.sessionKeys = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessDeviceAbpV11Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> devAddr;
        private Input<WirelessDeviceSessionKeysAbpV11Args> sessionKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(WirelessDeviceAbpV11Args defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.devAddr = defaults.devAddr;
    	      this.sessionKeys = defaults.sessionKeys;
        }

        public Builder setDevAddr(Input<String> devAddr) {
            this.devAddr = Objects.requireNonNull(devAddr);
            return this;
        }

        public Builder setDevAddr(String devAddr) {
            this.devAddr = Input.of(Objects.requireNonNull(devAddr));
            return this;
        }

        public Builder setSessionKeys(Input<WirelessDeviceSessionKeysAbpV11Args> sessionKeys) {
            this.sessionKeys = Objects.requireNonNull(sessionKeys);
            return this;
        }

        public Builder setSessionKeys(WirelessDeviceSessionKeysAbpV11Args sessionKeys) {
            this.sessionKeys = Input.of(Objects.requireNonNull(sessionKeys));
            return this;
        }
        public WirelessDeviceAbpV11Args build() {
            return new WirelessDeviceAbpV11Args(devAddr, sessionKeys);
        }
    }
}
