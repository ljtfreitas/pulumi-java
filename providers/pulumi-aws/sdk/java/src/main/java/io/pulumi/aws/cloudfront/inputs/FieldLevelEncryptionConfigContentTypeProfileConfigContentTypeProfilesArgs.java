// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItemArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesArgs extends io.pulumi.resources.ResourceArgs {

    public static final FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesArgs Empty = new FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesArgs();

    @Import(name="items", required=true)
      private final Output<List<FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItemArgs>> items;

    public Output<List<FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItemArgs>> getItems() {
        return this.items;
    }

    public FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesArgs(Output<List<FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItemArgs>> items) {
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
    }

    private FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesArgs() {
        this.items = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItemArgs>> items;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(Output<List<FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItemArgs>> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public Builder items(List<FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItemArgs> items) {
            this.items = Output.of(Objects.requireNonNull(items));
            return this;
        }
        public FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesArgs build() {
            return new FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesArgs(items);
        }
    }
}
