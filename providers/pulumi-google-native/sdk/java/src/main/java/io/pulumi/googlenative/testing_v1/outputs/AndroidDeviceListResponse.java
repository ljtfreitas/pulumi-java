// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.testing_v1.outputs.AndroidDeviceResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AndroidDeviceListResponse {
    /**
     * A list of Android devices.
     * 
     */
    private final List<AndroidDeviceResponse> androidDevices;

    @CustomType.Constructor
    private AndroidDeviceListResponse(@CustomType.Parameter("androidDevices") List<AndroidDeviceResponse> androidDevices) {
        this.androidDevices = androidDevices;
    }

    /**
     * A list of Android devices.
     * 
    */
    public List<AndroidDeviceResponse> getAndroidDevices() {
        return this.androidDevices;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AndroidDeviceListResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AndroidDeviceResponse> androidDevices;

        public Builder() {
    	      // Empty
        }

        public Builder(AndroidDeviceListResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.androidDevices = defaults.androidDevices;
        }

        public Builder androidDevices(List<AndroidDeviceResponse> androidDevices) {
            this.androidDevices = Objects.requireNonNull(androidDevices);
            return this;
        }
        public AndroidDeviceListResponse build() {
            return new AndroidDeviceListResponse(androidDevices);
        }
    }
}
