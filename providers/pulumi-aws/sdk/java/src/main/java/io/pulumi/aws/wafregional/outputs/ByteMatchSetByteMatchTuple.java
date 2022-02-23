// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafregional.outputs;

import io.pulumi.aws.wafregional.outputs.ByteMatchSetByteMatchTupleFieldToMatch;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ByteMatchSetByteMatchTuple {
    /**
     * Settings for the ByteMatchTuple. FieldToMatch documented below.
     * 
     */
    private final ByteMatchSetByteMatchTupleFieldToMatch fieldToMatch;
    /**
     * Within the portion of a web request that you want to search.
     * 
     */
    private final String positionalConstraint;
    /**
     * The value that you want AWS WAF to search for. The maximum length of the value is 50 bytes.
     * 
     */
    private final @Nullable String targetString;
    /**
     * The formatting way for web request.
     * 
     */
    private final String textTransformation;

    @OutputCustomType.Constructor({"fieldToMatch","positionalConstraint","targetString","textTransformation"})
    private ByteMatchSetByteMatchTuple(
        ByteMatchSetByteMatchTupleFieldToMatch fieldToMatch,
        String positionalConstraint,
        @Nullable String targetString,
        String textTransformation) {
        this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
        this.positionalConstraint = Objects.requireNonNull(positionalConstraint);
        this.targetString = targetString;
        this.textTransformation = Objects.requireNonNull(textTransformation);
    }

    /**
     * Settings for the ByteMatchTuple. FieldToMatch documented below.
     * 
     */
    public ByteMatchSetByteMatchTupleFieldToMatch getFieldToMatch() {
        return this.fieldToMatch;
    }
    /**
     * Within the portion of a web request that you want to search.
     * 
     */
    public String getPositionalConstraint() {
        return this.positionalConstraint;
    }
    /**
     * The value that you want AWS WAF to search for. The maximum length of the value is 50 bytes.
     * 
     */
    public Optional<String> getTargetString() {
        return Optional.ofNullable(this.targetString);
    }
    /**
     * The formatting way for web request.
     * 
     */
    public String getTextTransformation() {
        return this.textTransformation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ByteMatchSetByteMatchTuple defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ByteMatchSetByteMatchTupleFieldToMatch fieldToMatch;
        private String positionalConstraint;
        private @Nullable String targetString;
        private String textTransformation;

        public Builder() {
    	      // Empty
        }

        public Builder(ByteMatchSetByteMatchTuple defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fieldToMatch = defaults.fieldToMatch;
    	      this.positionalConstraint = defaults.positionalConstraint;
    	      this.targetString = defaults.targetString;
    	      this.textTransformation = defaults.textTransformation;
        }

        public Builder setFieldToMatch(ByteMatchSetByteMatchTupleFieldToMatch fieldToMatch) {
            this.fieldToMatch = Objects.requireNonNull(fieldToMatch);
            return this;
        }

        public Builder setPositionalConstraint(String positionalConstraint) {
            this.positionalConstraint = Objects.requireNonNull(positionalConstraint);
            return this;
        }

        public Builder setTargetString(@Nullable String targetString) {
            this.targetString = targetString;
            return this;
        }

        public Builder setTextTransformation(String textTransformation) {
            this.textTransformation = Objects.requireNonNull(textTransformation);
            return this;
        }
        public ByteMatchSetByteMatchTuple build() {
            return new ByteMatchSetByteMatchTuple(fieldToMatch, positionalConstraint, targetString, textTransformation);
        }
    }
}
