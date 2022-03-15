// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WirelessDeviceSessionKeysAbpV10x extends io.pulumi.resources.InvokeArgs {

    public static final WirelessDeviceSessionKeysAbpV10x Empty = new WirelessDeviceSessionKeysAbpV10x();

    @Import(name="appSKey", required=true)
      private final String appSKey;

    public String getAppSKey() {
        return this.appSKey;
    }

    @Import(name="nwkSKey", required=true)
      private final String nwkSKey;

    public String getNwkSKey() {
        return this.nwkSKey;
    }

    public WirelessDeviceSessionKeysAbpV10x(
        String appSKey,
        String nwkSKey) {
        this.appSKey = Objects.requireNonNull(appSKey, "expected parameter 'appSKey' to be non-null");
        this.nwkSKey = Objects.requireNonNull(nwkSKey, "expected parameter 'nwkSKey' to be non-null");
    }

    private WirelessDeviceSessionKeysAbpV10x() {
        this.appSKey = null;
        this.nwkSKey = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessDeviceSessionKeysAbpV10x defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appSKey;
        private String nwkSKey;

        public Builder() {
    	      // Empty
        }

        public Builder(WirelessDeviceSessionKeysAbpV10x defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appSKey = defaults.appSKey;
    	      this.nwkSKey = defaults.nwkSKey;
        }

        public Builder appSKey(String appSKey) {
            this.appSKey = Objects.requireNonNull(appSKey);
            return this;
        }

        public Builder nwkSKey(String nwkSKey) {
            this.nwkSKey = Objects.requireNonNull(nwkSKey);
            return this;
        }
        public WirelessDeviceSessionKeysAbpV10x build() {
            return new WirelessDeviceSessionKeysAbpV10x(appSKey, nwkSKey);
        }
    }
}
