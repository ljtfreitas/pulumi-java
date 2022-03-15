// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.testing_v1.inputs.AndroidDeviceResponse;
import io.pulumi.googlenative.testing_v1.inputs.IosDeviceResponse;
import java.util.Objects;


/**
 * The environment in which the test is run.
 * 
 */
public final class EnvironmentResponse extends io.pulumi.resources.InvokeArgs {

    public static final EnvironmentResponse Empty = new EnvironmentResponse();

    /**
     * An Android device which must be used with an Android test.
     * 
     */
    @Import(name="androidDevice", required=true)
      private final AndroidDeviceResponse androidDevice;

    public AndroidDeviceResponse getAndroidDevice() {
        return this.androidDevice;
    }

    /**
     * An iOS device which must be used with an iOS test.
     * 
     */
    @Import(name="iosDevice", required=true)
      private final IosDeviceResponse iosDevice;

    public IosDeviceResponse getIosDevice() {
        return this.iosDevice;
    }

    public EnvironmentResponse(
        AndroidDeviceResponse androidDevice,
        IosDeviceResponse iosDevice) {
        this.androidDevice = Objects.requireNonNull(androidDevice, "expected parameter 'androidDevice' to be non-null");
        this.iosDevice = Objects.requireNonNull(iosDevice, "expected parameter 'iosDevice' to be non-null");
    }

    private EnvironmentResponse() {
        this.androidDevice = null;
        this.iosDevice = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AndroidDeviceResponse androidDevice;
        private IosDeviceResponse iosDevice;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.androidDevice = defaults.androidDevice;
    	      this.iosDevice = defaults.iosDevice;
        }

        public Builder androidDevice(AndroidDeviceResponse androidDevice) {
            this.androidDevice = Objects.requireNonNull(androidDevice);
            return this;
        }

        public Builder iosDevice(IosDeviceResponse iosDevice) {
            this.iosDevice = Objects.requireNonNull(iosDevice);
            return this;
        }
        public EnvironmentResponse build() {
            return new EnvironmentResponse(androidDevice, iosDevice);
        }
    }
}
