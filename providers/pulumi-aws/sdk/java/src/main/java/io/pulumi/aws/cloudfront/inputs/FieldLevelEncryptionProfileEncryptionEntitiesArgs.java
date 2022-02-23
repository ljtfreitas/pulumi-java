// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.FieldLevelEncryptionProfileEncryptionEntitiesItemArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FieldLevelEncryptionProfileEncryptionEntitiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final FieldLevelEncryptionProfileEncryptionEntitiesArgs Empty = new FieldLevelEncryptionProfileEncryptionEntitiesArgs();

    @InputImport(name="items")
    private final @Nullable Input<List<FieldLevelEncryptionProfileEncryptionEntitiesItemArgs>> items;

    public Input<List<FieldLevelEncryptionProfileEncryptionEntitiesItemArgs>> getItems() {
        return this.items == null ? Input.empty() : this.items;
    }

    public FieldLevelEncryptionProfileEncryptionEntitiesArgs(@Nullable Input<List<FieldLevelEncryptionProfileEncryptionEntitiesItemArgs>> items) {
        this.items = items;
    }

    private FieldLevelEncryptionProfileEncryptionEntitiesArgs() {
        this.items = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldLevelEncryptionProfileEncryptionEntitiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<FieldLevelEncryptionProfileEncryptionEntitiesItemArgs>> items;

        public Builder() {
    	      // Empty
        }

        public Builder(FieldLevelEncryptionProfileEncryptionEntitiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder setItems(@Nullable Input<List<FieldLevelEncryptionProfileEncryptionEntitiesItemArgs>> items) {
            this.items = items;
            return this;
        }

        public Builder setItems(@Nullable List<FieldLevelEncryptionProfileEncryptionEntitiesItemArgs> items) {
            this.items = Input.ofNullable(items);
            return this;
        }
        public FieldLevelEncryptionProfileEncryptionEntitiesArgs build() {
            return new FieldLevelEncryptionProfileEncryptionEntitiesArgs(items);
        }
    }
}
