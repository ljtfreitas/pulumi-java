// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Output only. Defines a warning trace message for ScanRun. Warning traces provide customers with useful information that helps make the scanning process more effective.
 * 
 */
public final class ScanRunWarningTraceResponse extends io.pulumi.resources.InvokeArgs {

    public static final ScanRunWarningTraceResponse Empty = new ScanRunWarningTraceResponse();

    /**
     * Indicates the warning code.
     * 
     */
    @InputImport(name="code", required=true)
      private final String code;

    public String getCode() {
        return this.code;
    }

    public ScanRunWarningTraceResponse(String code) {
        this.code = Objects.requireNonNull(code, "expected parameter 'code' to be non-null");
    }

    private ScanRunWarningTraceResponse() {
        this.code = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScanRunWarningTraceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;

        public Builder() {
    	      // Empty
        }

        public Builder(ScanRunWarningTraceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }
        public ScanRunWarningTraceResponse build() {
            return new ScanRunWarningTraceResponse(code);
        }
    }
}
