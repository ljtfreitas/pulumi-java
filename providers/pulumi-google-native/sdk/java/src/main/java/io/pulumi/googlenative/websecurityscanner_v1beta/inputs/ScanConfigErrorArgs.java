// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.websecurityscanner_v1beta.enums.ScanConfigErrorCode;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines a custom error message used by CreateScanConfig and UpdateScanConfig APIs when scan configuration validation fails. It is also reported as part of a ScanRunErrorTrace message if scan validation fails due to a scan configuration error.
 * 
 */
public final class ScanConfigErrorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScanConfigErrorArgs Empty = new ScanConfigErrorArgs();

    /**
     * Indicates the reason code for a configuration failure.
     * 
     */
    @InputImport(name="code")
      private final @Nullable Input<ScanConfigErrorCode> code;

    public Input<ScanConfigErrorCode> getCode() {
        return this.code == null ? Input.empty() : this.code;
    }

    /**
     * Indicates the full name of the ScanConfig field that triggers this error, for example "scan_config.max_qps". This field is provided for troubleshooting purposes only and its actual value can change in the future.
     * 
     */
    @InputImport(name="fieldName")
      private final @Nullable Input<String> fieldName;

    public Input<String> getFieldName() {
        return this.fieldName == null ? Input.empty() : this.fieldName;
    }

    public ScanConfigErrorArgs(
        @Nullable Input<ScanConfigErrorCode> code,
        @Nullable Input<String> fieldName) {
        this.code = code;
        this.fieldName = fieldName;
    }

    private ScanConfigErrorArgs() {
        this.code = Input.empty();
        this.fieldName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScanConfigErrorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ScanConfigErrorCode> code;
        private @Nullable Input<String> fieldName;

        public Builder() {
    	      // Empty
        }

        public Builder(ScanConfigErrorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.fieldName = defaults.fieldName;
        }

        public Builder setCode(@Nullable Input<ScanConfigErrorCode> code) {
            this.code = code;
            return this;
        }

        public Builder setCode(@Nullable ScanConfigErrorCode code) {
            this.code = Input.ofNullable(code);
            return this;
        }

        public Builder setFieldName(@Nullable Input<String> fieldName) {
            this.fieldName = fieldName;
            return this;
        }

        public Builder setFieldName(@Nullable String fieldName) {
            this.fieldName = Input.ofNullable(fieldName);
            return this;
        }
        public ScanConfigErrorArgs build() {
            return new ScanConfigErrorArgs(code, fieldName);
        }
    }
}
