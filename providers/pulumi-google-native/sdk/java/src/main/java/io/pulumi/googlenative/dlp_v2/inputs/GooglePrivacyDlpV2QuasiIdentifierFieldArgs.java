// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldIdArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A quasi-identifier column has a custom_tag, used to know which column in the data corresponds to which column in the statistical model.
 * 
 */
public final class GooglePrivacyDlpV2QuasiIdentifierFieldArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2QuasiIdentifierFieldArgs Empty = new GooglePrivacyDlpV2QuasiIdentifierFieldArgs();

    /**
     * A column can be tagged with a custom tag. In this case, the user must indicate an auxiliary table that contains statistical information on the possible values of this column (below).
     * 
     */
    @Import(name="customTag")
      private final @Nullable Output<String> customTag;

    public Output<String> getCustomTag() {
        return this.customTag == null ? Output.empty() : this.customTag;
    }

    /**
     * Identifies the column.
     * 
     */
    @Import(name="field")
      private final @Nullable Output<GooglePrivacyDlpV2FieldIdArgs> field;

    public Output<GooglePrivacyDlpV2FieldIdArgs> getField() {
        return this.field == null ? Output.empty() : this.field;
    }

    public GooglePrivacyDlpV2QuasiIdentifierFieldArgs(
        @Nullable Output<String> customTag,
        @Nullable Output<GooglePrivacyDlpV2FieldIdArgs> field) {
        this.customTag = customTag;
        this.field = field;
    }

    private GooglePrivacyDlpV2QuasiIdentifierFieldArgs() {
        this.customTag = Output.empty();
        this.field = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2QuasiIdentifierFieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> customTag;
        private @Nullable Output<GooglePrivacyDlpV2FieldIdArgs> field;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2QuasiIdentifierFieldArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customTag = defaults.customTag;
    	      this.field = defaults.field;
        }

        public Builder customTag(@Nullable Output<String> customTag) {
            this.customTag = customTag;
            return this;
        }

        public Builder customTag(@Nullable String customTag) {
            this.customTag = Output.ofNullable(customTag);
            return this;
        }

        public Builder field(@Nullable Output<GooglePrivacyDlpV2FieldIdArgs> field) {
            this.field = field;
            return this;
        }

        public Builder field(@Nullable GooglePrivacyDlpV2FieldIdArgs field) {
            this.field = Output.ofNullable(field);
            return this;
        }
        public GooglePrivacyDlpV2QuasiIdentifierFieldArgs build() {
            return new GooglePrivacyDlpV2QuasiIdentifierFieldArgs(customTag, field);
        }
    }
}
