// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


/**
 * The X12 processing settings.
 * 
 */
public final class X12ProcessingSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final X12ProcessingSettingsArgs Empty = new X12ProcessingSettingsArgs();

    /**
     * The value indicating whether to convert numerical type to implied decimal.
     * 
     */
    @InputImport(name="convertImpliedDecimal", required=true)
        private final Input<Boolean> convertImpliedDecimal;

    public Input<Boolean> getConvertImpliedDecimal() {
        return this.convertImpliedDecimal;
    }

    /**
     * The value indicating whether to create empty xml tags for trailing separators.
     * 
     */
    @InputImport(name="createEmptyXmlTagsForTrailingSeparators", required=true)
        private final Input<Boolean> createEmptyXmlTagsForTrailingSeparators;

    public Input<Boolean> getCreateEmptyXmlTagsForTrailingSeparators() {
        return this.createEmptyXmlTagsForTrailingSeparators;
    }

    /**
     * The value indicating whether to mask security information.
     * 
     */
    @InputImport(name="maskSecurityInfo", required=true)
        private final Input<Boolean> maskSecurityInfo;

    public Input<Boolean> getMaskSecurityInfo() {
        return this.maskSecurityInfo;
    }

    /**
     * The value indicating whether to preserve interchange.
     * 
     */
    @InputImport(name="preserveInterchange", required=true)
        private final Input<Boolean> preserveInterchange;

    public Input<Boolean> getPreserveInterchange() {
        return this.preserveInterchange;
    }

    /**
     * The value indicating whether to suspend interchange on error.
     * 
     */
    @InputImport(name="suspendInterchangeOnError", required=true)
        private final Input<Boolean> suspendInterchangeOnError;

    public Input<Boolean> getSuspendInterchangeOnError() {
        return this.suspendInterchangeOnError;
    }

    /**
     * The value indicating whether to use dot as decimal separator.
     * 
     */
    @InputImport(name="useDotAsDecimalSeparator", required=true)
        private final Input<Boolean> useDotAsDecimalSeparator;

    public Input<Boolean> getUseDotAsDecimalSeparator() {
        return this.useDotAsDecimalSeparator;
    }

    public X12ProcessingSettingsArgs(
        Input<Boolean> convertImpliedDecimal,
        Input<Boolean> createEmptyXmlTagsForTrailingSeparators,
        Input<Boolean> maskSecurityInfo,
        Input<Boolean> preserveInterchange,
        Input<Boolean> suspendInterchangeOnError,
        Input<Boolean> useDotAsDecimalSeparator) {
        this.convertImpliedDecimal = Objects.requireNonNull(convertImpliedDecimal, "expected parameter 'convertImpliedDecimal' to be non-null");
        this.createEmptyXmlTagsForTrailingSeparators = Objects.requireNonNull(createEmptyXmlTagsForTrailingSeparators, "expected parameter 'createEmptyXmlTagsForTrailingSeparators' to be non-null");
        this.maskSecurityInfo = Objects.requireNonNull(maskSecurityInfo, "expected parameter 'maskSecurityInfo' to be non-null");
        this.preserveInterchange = Objects.requireNonNull(preserveInterchange, "expected parameter 'preserveInterchange' to be non-null");
        this.suspendInterchangeOnError = Objects.requireNonNull(suspendInterchangeOnError, "expected parameter 'suspendInterchangeOnError' to be non-null");
        this.useDotAsDecimalSeparator = Objects.requireNonNull(useDotAsDecimalSeparator, "expected parameter 'useDotAsDecimalSeparator' to be non-null");
    }

    private X12ProcessingSettingsArgs() {
        this.convertImpliedDecimal = Input.empty();
        this.createEmptyXmlTagsForTrailingSeparators = Input.empty();
        this.maskSecurityInfo = Input.empty();
        this.preserveInterchange = Input.empty();
        this.suspendInterchangeOnError = Input.empty();
        this.useDotAsDecimalSeparator = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12ProcessingSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> convertImpliedDecimal;
        private Input<Boolean> createEmptyXmlTagsForTrailingSeparators;
        private Input<Boolean> maskSecurityInfo;
        private Input<Boolean> preserveInterchange;
        private Input<Boolean> suspendInterchangeOnError;
        private Input<Boolean> useDotAsDecimalSeparator;

        public Builder() {
    	      // Empty
        }

        public Builder(X12ProcessingSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.convertImpliedDecimal = defaults.convertImpliedDecimal;
    	      this.createEmptyXmlTagsForTrailingSeparators = defaults.createEmptyXmlTagsForTrailingSeparators;
    	      this.maskSecurityInfo = defaults.maskSecurityInfo;
    	      this.preserveInterchange = defaults.preserveInterchange;
    	      this.suspendInterchangeOnError = defaults.suspendInterchangeOnError;
    	      this.useDotAsDecimalSeparator = defaults.useDotAsDecimalSeparator;
        }

        public Builder setConvertImpliedDecimal(Input<Boolean> convertImpliedDecimal) {
            this.convertImpliedDecimal = Objects.requireNonNull(convertImpliedDecimal);
            return this;
        }

        public Builder setConvertImpliedDecimal(Boolean convertImpliedDecimal) {
            this.convertImpliedDecimal = Input.of(Objects.requireNonNull(convertImpliedDecimal));
            return this;
        }

        public Builder setCreateEmptyXmlTagsForTrailingSeparators(Input<Boolean> createEmptyXmlTagsForTrailingSeparators) {
            this.createEmptyXmlTagsForTrailingSeparators = Objects.requireNonNull(createEmptyXmlTagsForTrailingSeparators);
            return this;
        }

        public Builder setCreateEmptyXmlTagsForTrailingSeparators(Boolean createEmptyXmlTagsForTrailingSeparators) {
            this.createEmptyXmlTagsForTrailingSeparators = Input.of(Objects.requireNonNull(createEmptyXmlTagsForTrailingSeparators));
            return this;
        }

        public Builder setMaskSecurityInfo(Input<Boolean> maskSecurityInfo) {
            this.maskSecurityInfo = Objects.requireNonNull(maskSecurityInfo);
            return this;
        }

        public Builder setMaskSecurityInfo(Boolean maskSecurityInfo) {
            this.maskSecurityInfo = Input.of(Objects.requireNonNull(maskSecurityInfo));
            return this;
        }

        public Builder setPreserveInterchange(Input<Boolean> preserveInterchange) {
            this.preserveInterchange = Objects.requireNonNull(preserveInterchange);
            return this;
        }

        public Builder setPreserveInterchange(Boolean preserveInterchange) {
            this.preserveInterchange = Input.of(Objects.requireNonNull(preserveInterchange));
            return this;
        }

        public Builder setSuspendInterchangeOnError(Input<Boolean> suspendInterchangeOnError) {
            this.suspendInterchangeOnError = Objects.requireNonNull(suspendInterchangeOnError);
            return this;
        }

        public Builder setSuspendInterchangeOnError(Boolean suspendInterchangeOnError) {
            this.suspendInterchangeOnError = Input.of(Objects.requireNonNull(suspendInterchangeOnError));
            return this;
        }

        public Builder setUseDotAsDecimalSeparator(Input<Boolean> useDotAsDecimalSeparator) {
            this.useDotAsDecimalSeparator = Objects.requireNonNull(useDotAsDecimalSeparator);
            return this;
        }

        public Builder setUseDotAsDecimalSeparator(Boolean useDotAsDecimalSeparator) {
            this.useDotAsDecimalSeparator = Input.of(Objects.requireNonNull(useDotAsDecimalSeparator));
            return this;
        }
        public X12ProcessingSettingsArgs build() {
            return new X12ProcessingSettingsArgs(convertImpliedDecimal, createEmptyXmlTagsForTrailingSeparators, maskSecurityInfo, preserveInterchange, suspendInterchangeOnError, useDotAsDecimalSeparator);
        }
    }
}
