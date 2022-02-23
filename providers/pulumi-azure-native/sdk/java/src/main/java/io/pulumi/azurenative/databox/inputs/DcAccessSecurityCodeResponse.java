// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Dc access security code
 * 
 */
public final class DcAccessSecurityCodeResponse extends io.pulumi.resources.InvokeArgs {

    public static final DcAccessSecurityCodeResponse Empty = new DcAccessSecurityCodeResponse();

    /**
     * Forward Dc access security code.
     * 
     */
    @InputImport(name="forwardDCAccessCode")
        private final @Nullable String forwardDCAccessCode;

    public Optional<String> getForwardDCAccessCode() {
        return this.forwardDCAccessCode == null ? Optional.empty() : Optional.ofNullable(this.forwardDCAccessCode);
    }

    /**
     * Reverse Dc access security code.
     * 
     */
    @InputImport(name="reverseDCAccessCode")
        private final @Nullable String reverseDCAccessCode;

    public Optional<String> getReverseDCAccessCode() {
        return this.reverseDCAccessCode == null ? Optional.empty() : Optional.ofNullable(this.reverseDCAccessCode);
    }

    public DcAccessSecurityCodeResponse(
        @Nullable String forwardDCAccessCode,
        @Nullable String reverseDCAccessCode) {
        this.forwardDCAccessCode = forwardDCAccessCode;
        this.reverseDCAccessCode = reverseDCAccessCode;
    }

    private DcAccessSecurityCodeResponse() {
        this.forwardDCAccessCode = null;
        this.reverseDCAccessCode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DcAccessSecurityCodeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String forwardDCAccessCode;
        private @Nullable String reverseDCAccessCode;

        public Builder() {
    	      // Empty
        }

        public Builder(DcAccessSecurityCodeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forwardDCAccessCode = defaults.forwardDCAccessCode;
    	      this.reverseDCAccessCode = defaults.reverseDCAccessCode;
        }

        public Builder setForwardDCAccessCode(@Nullable String forwardDCAccessCode) {
            this.forwardDCAccessCode = forwardDCAccessCode;
            return this;
        }

        public Builder setReverseDCAccessCode(@Nullable String reverseDCAccessCode) {
            this.reverseDCAccessCode = reverseDCAccessCode;
            return this;
        }
        public DcAccessSecurityCodeResponse build() {
            return new DcAccessSecurityCodeResponse(forwardDCAccessCode, reverseDCAccessCode);
        }
    }
}
