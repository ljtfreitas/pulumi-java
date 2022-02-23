// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The action to take.
 * 
 */
public final class BucketLifecycleRuleItemActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleRuleItemActionArgs Empty = new BucketLifecycleRuleItemActionArgs();

    /**
     * Target storage class. Required iff the type of the action is SetStorageClass.
     * 
     */
    @InputImport(name="storageClass")
      private final @Nullable Input<String> storageClass;

    public Input<String> getStorageClass() {
        return this.storageClass == null ? Input.empty() : this.storageClass;
    }

    /**
     * Type of the action. Currently, only Delete and SetStorageClass are supported.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public BucketLifecycleRuleItemActionArgs(
        @Nullable Input<String> storageClass,
        @Nullable Input<String> type) {
        this.storageClass = storageClass;
        this.type = type;
    }

    private BucketLifecycleRuleItemActionArgs() {
        this.storageClass = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleRuleItemActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> storageClass;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleRuleItemActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.storageClass = defaults.storageClass;
    	      this.type = defaults.type;
        }

        public Builder setStorageClass(@Nullable Input<String> storageClass) {
            this.storageClass = storageClass;
            return this;
        }

        public Builder setStorageClass(@Nullable String storageClass) {
            this.storageClass = Input.ofNullable(storageClass);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public BucketLifecycleRuleItemActionArgs build() {
            return new BucketLifecycleRuleItemActionArgs(storageClass, type);
        }
    }
}
