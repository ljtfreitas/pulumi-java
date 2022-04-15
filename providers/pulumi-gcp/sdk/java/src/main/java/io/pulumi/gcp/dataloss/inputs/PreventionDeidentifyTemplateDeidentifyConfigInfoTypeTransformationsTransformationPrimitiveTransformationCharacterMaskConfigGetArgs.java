// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigGetArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigGetArgs();

    /**
     * Characters to skip when doing de-identification of a value. These will be left alone and skipped.
     * Structure is documented below.
     * 
     */
    @Import(name="charactersToIgnores")
      private final @Nullable Output<List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs>> charactersToIgnores;

    public Output<List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs>> charactersToIgnores() {
        return this.charactersToIgnores == null ? Codegen.empty() : this.charactersToIgnores;
    }

    /**
     * Character to use to mask the sensitive values—for example, * for an alphabetic string such as a name, or 0 for a numeric string
     * such as ZIP code or credit card number. This string must have a length of 1. If not supplied, this value defaults to * for
     * strings, and 0 for digits.
     * 
     */
    @Import(name="maskingCharacter")
      private final @Nullable Output<String> maskingCharacter;

    public Output<String> maskingCharacter() {
        return this.maskingCharacter == null ? Codegen.empty() : this.maskingCharacter;
    }

    /**
     * Number of characters to mask. If not set, all matching chars will be masked. Skipped characters do not count towards this tally.
     * 
     */
    @Import(name="numberToMask")
      private final @Nullable Output<Integer> numberToMask;

    public Output<Integer> numberToMask() {
        return this.numberToMask == null ? Codegen.empty() : this.numberToMask;
    }

    /**
     * Mask characters in reverse order. For example, if masking_character is 0, number_to_mask is 14, and reverse_order is `false`, then the
     * input string `1234-5678-9012-3456` is masked as `00000000000000-3456`.
     * 
     */
    @Import(name="reverseOrder")
      private final @Nullable Output<Boolean> reverseOrder;

    public Output<Boolean> reverseOrder() {
        return this.reverseOrder == null ? Codegen.empty() : this.reverseOrder;
    }

    public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigGetArgs(
        @Nullable Output<List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs>> charactersToIgnores,
        @Nullable Output<String> maskingCharacter,
        @Nullable Output<Integer> numberToMask,
        @Nullable Output<Boolean> reverseOrder) {
        this.charactersToIgnores = charactersToIgnores;
        this.maskingCharacter = maskingCharacter;
        this.numberToMask = numberToMask;
        this.reverseOrder = reverseOrder;
    }

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigGetArgs() {
        this.charactersToIgnores = Codegen.empty();
        this.maskingCharacter = Codegen.empty();
        this.numberToMask = Codegen.empty();
        this.reverseOrder = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs>> charactersToIgnores;
        private @Nullable Output<String> maskingCharacter;
        private @Nullable Output<Integer> numberToMask;
        private @Nullable Output<Boolean> reverseOrder;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.charactersToIgnores = defaults.charactersToIgnores;
    	      this.maskingCharacter = defaults.maskingCharacter;
    	      this.numberToMask = defaults.numberToMask;
    	      this.reverseOrder = defaults.reverseOrder;
        }

        public Builder charactersToIgnores(@Nullable Output<List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs>> charactersToIgnores) {
            this.charactersToIgnores = charactersToIgnores;
            return this;
        }
        public Builder charactersToIgnores(@Nullable List<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs> charactersToIgnores) {
            this.charactersToIgnores = Codegen.ofNullable(charactersToIgnores);
            return this;
        }
        public Builder charactersToIgnores(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigCharactersToIgnoreGetArgs... charactersToIgnores) {
            return charactersToIgnores(List.of(charactersToIgnores));
        }
        public Builder maskingCharacter(@Nullable Output<String> maskingCharacter) {
            this.maskingCharacter = maskingCharacter;
            return this;
        }
        public Builder maskingCharacter(@Nullable String maskingCharacter) {
            this.maskingCharacter = Codegen.ofNullable(maskingCharacter);
            return this;
        }
        public Builder numberToMask(@Nullable Output<Integer> numberToMask) {
            this.numberToMask = numberToMask;
            return this;
        }
        public Builder numberToMask(@Nullable Integer numberToMask) {
            this.numberToMask = Codegen.ofNullable(numberToMask);
            return this;
        }
        public Builder reverseOrder(@Nullable Output<Boolean> reverseOrder) {
            this.reverseOrder = reverseOrder;
            return this;
        }
        public Builder reverseOrder(@Nullable Boolean reverseOrder) {
            this.reverseOrder = Codegen.ofNullable(reverseOrder);
            return this;
        }        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigGetArgs build() {
            return new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationCharacterMaskConfigGetArgs(charactersToIgnores, maskingCharacter, numberToMask, reverseOrder);
        }
    }
}
