// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.testing_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A single Android device.
 * 
 */
public final class AndroidDeviceArgs extends io.pulumi.resources.ResourceArgs {

    public static final AndroidDeviceArgs Empty = new AndroidDeviceArgs();

    /**
     * The id of the Android device to be used. Use the TestEnvironmentDiscoveryService to get supported options.
     * 
     */
    @InputImport(name="androidModelId", required=true)
      private final Input<String> androidModelId;

    public Input<String> getAndroidModelId() {
        return this.androidModelId;
    }

    /**
     * The id of the Android OS version to be used. Use the TestEnvironmentDiscoveryService to get supported options.
     * 
     */
    @InputImport(name="androidVersionId", required=true)
      private final Input<String> androidVersionId;

    public Input<String> getAndroidVersionId() {
        return this.androidVersionId;
    }

    /**
     * The locale the test device used for testing. Use the TestEnvironmentDiscoveryService to get supported options.
     * 
     */
    @InputImport(name="locale", required=true)
      private final Input<String> locale;

    public Input<String> getLocale() {
        return this.locale;
    }

    /**
     * How the device is oriented during the test. Use the TestEnvironmentDiscoveryService to get supported options.
     * 
     */
    @InputImport(name="orientation", required=true)
      private final Input<String> orientation;

    public Input<String> getOrientation() {
        return this.orientation;
    }

    public AndroidDeviceArgs(
        Input<String> androidModelId,
        Input<String> androidVersionId,
        Input<String> locale,
        Input<String> orientation) {
        this.androidModelId = Objects.requireNonNull(androidModelId, "expected parameter 'androidModelId' to be non-null");
        this.androidVersionId = Objects.requireNonNull(androidVersionId, "expected parameter 'androidVersionId' to be non-null");
        this.locale = Objects.requireNonNull(locale, "expected parameter 'locale' to be non-null");
        this.orientation = Objects.requireNonNull(orientation, "expected parameter 'orientation' to be non-null");
    }

    private AndroidDeviceArgs() {
        this.androidModelId = Input.empty();
        this.androidVersionId = Input.empty();
        this.locale = Input.empty();
        this.orientation = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AndroidDeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> androidModelId;
        private Input<String> androidVersionId;
        private Input<String> locale;
        private Input<String> orientation;

        public Builder() {
    	      // Empty
        }

        public Builder(AndroidDeviceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.androidModelId = defaults.androidModelId;
    	      this.androidVersionId = defaults.androidVersionId;
    	      this.locale = defaults.locale;
    	      this.orientation = defaults.orientation;
        }

        public Builder setAndroidModelId(Input<String> androidModelId) {
            this.androidModelId = Objects.requireNonNull(androidModelId);
            return this;
        }

        public Builder setAndroidModelId(String androidModelId) {
            this.androidModelId = Input.of(Objects.requireNonNull(androidModelId));
            return this;
        }

        public Builder setAndroidVersionId(Input<String> androidVersionId) {
            this.androidVersionId = Objects.requireNonNull(androidVersionId);
            return this;
        }

        public Builder setAndroidVersionId(String androidVersionId) {
            this.androidVersionId = Input.of(Objects.requireNonNull(androidVersionId));
            return this;
        }

        public Builder setLocale(Input<String> locale) {
            this.locale = Objects.requireNonNull(locale);
            return this;
        }

        public Builder setLocale(String locale) {
            this.locale = Input.of(Objects.requireNonNull(locale));
            return this;
        }

        public Builder setOrientation(Input<String> orientation) {
            this.orientation = Objects.requireNonNull(orientation);
            return this;
        }

        public Builder setOrientation(String orientation) {
            this.orientation = Input.of(Objects.requireNonNull(orientation));
            return this;
        }
        public AndroidDeviceArgs build() {
            return new AndroidDeviceArgs(androidModelId, androidVersionId, locale, orientation);
        }
    }
}
