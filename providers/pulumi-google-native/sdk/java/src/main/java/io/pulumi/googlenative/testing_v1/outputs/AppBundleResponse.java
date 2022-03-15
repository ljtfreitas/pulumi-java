// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.testing_v1.outputs.FileReferenceResponse;
import java.util.Objects;

@CustomType
public final class AppBundleResponse {
    /**
     * .aab file representing the app bundle under test.
     * 
     */
    private final FileReferenceResponse bundleLocation;

    @CustomType.Constructor
    private AppBundleResponse(@CustomType.Parameter("bundleLocation") FileReferenceResponse bundleLocation) {
        this.bundleLocation = bundleLocation;
    }

    /**
     * .aab file representing the app bundle under test.
     * 
    */
    public FileReferenceResponse getBundleLocation() {
        return this.bundleLocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppBundleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FileReferenceResponse bundleLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(AppBundleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bundleLocation = defaults.bundleLocation;
        }

        public Builder bundleLocation(FileReferenceResponse bundleLocation) {
            this.bundleLocation = Objects.requireNonNull(bundleLocation);
            return this;
        }
        public AppBundleResponse build() {
            return new AppBundleResponse(bundleLocation);
        }
    }
}
