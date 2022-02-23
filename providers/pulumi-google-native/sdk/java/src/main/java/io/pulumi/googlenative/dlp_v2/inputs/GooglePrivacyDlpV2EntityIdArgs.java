// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldIdArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An entity in a dataset is a field or set of fields that correspond to a single person. For example, in medical records the `EntityId` might be a patient identifier, or for financial records it might be an account identifier. This message is used when generalizations or analysis must take into account that multiple rows correspond to the same entity.
 * 
 */
public final class GooglePrivacyDlpV2EntityIdArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2EntityIdArgs Empty = new GooglePrivacyDlpV2EntityIdArgs();

    /**
     * Composite key indicating which field contains the entity identifier.
     * 
     */
    @InputImport(name="field")
      private final @Nullable Input<GooglePrivacyDlpV2FieldIdArgs> field;

    public Input<GooglePrivacyDlpV2FieldIdArgs> getField() {
        return this.field == null ? Input.empty() : this.field;
    }

    public GooglePrivacyDlpV2EntityIdArgs(@Nullable Input<GooglePrivacyDlpV2FieldIdArgs> field) {
        this.field = field;
    }

    private GooglePrivacyDlpV2EntityIdArgs() {
        this.field = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2EntityIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GooglePrivacyDlpV2FieldIdArgs> field;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2EntityIdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.field = defaults.field;
        }

        public Builder setField(@Nullable Input<GooglePrivacyDlpV2FieldIdArgs> field) {
            this.field = field;
            return this;
        }

        public Builder setField(@Nullable GooglePrivacyDlpV2FieldIdArgs field) {
            this.field = Input.ofNullable(field);
            return this;
        }
        public GooglePrivacyDlpV2EntityIdArgs build() {
            return new GooglePrivacyDlpV2EntityIdArgs(field);
        }
    }
}
