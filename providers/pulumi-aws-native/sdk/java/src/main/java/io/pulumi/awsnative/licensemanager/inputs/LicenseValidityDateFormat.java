// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.licensemanager.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class LicenseValidityDateFormat extends io.pulumi.resources.InvokeArgs {

    public static final LicenseValidityDateFormat Empty = new LicenseValidityDateFormat();

    /**
     * Validity begin date for the license.
     * 
     */
    @InputImport(name="begin", required=true)
        private final String begin;

    public String getBegin() {
        return this.begin;
    }

    /**
     * Validity begin date for the license.
     * 
     */
    @InputImport(name="end", required=true)
        private final String end;

    public String getEnd() {
        return this.end;
    }

    public LicenseValidityDateFormat(
        String begin,
        String end) {
        this.begin = Objects.requireNonNull(begin, "expected parameter 'begin' to be non-null");
        this.end = Objects.requireNonNull(end, "expected parameter 'end' to be non-null");
    }

    private LicenseValidityDateFormat() {
        this.begin = null;
        this.end = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LicenseValidityDateFormat defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String begin;
        private String end;

        public Builder() {
    	      // Empty
        }

        public Builder(LicenseValidityDateFormat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.begin = defaults.begin;
    	      this.end = defaults.end;
        }

        public Builder setBegin(String begin) {
            this.begin = Objects.requireNonNull(begin);
            return this;
        }

        public Builder setEnd(String end) {
            this.end = Objects.requireNonNull(end);
            return this;
        }
        public LicenseValidityDateFormat build() {
            return new LicenseValidityDateFormat(begin, end);
        }
    }
}
