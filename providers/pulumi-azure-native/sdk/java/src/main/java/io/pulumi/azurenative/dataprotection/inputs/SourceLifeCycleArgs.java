// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.azurenative.dataprotection.inputs.AbsoluteDeleteOptionArgs;
import io.pulumi.azurenative.dataprotection.inputs.DataStoreInfoBaseArgs;
import io.pulumi.azurenative.dataprotection.inputs.TargetCopySettingArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Source LifeCycle
 * 
 */
public final class SourceLifeCycleArgs extends io.pulumi.resources.ResourceArgs {

    public static final SourceLifeCycleArgs Empty = new SourceLifeCycleArgs();

    /**
     * Delete Option
     * 
     */
    @InputImport(name="deleteAfter", required=true)
    private final Input<AbsoluteDeleteOptionArgs> deleteAfter;

    public Input<AbsoluteDeleteOptionArgs> getDeleteAfter() {
        return this.deleteAfter;
    }

    /**
     * DataStoreInfo base
     * 
     */
    @InputImport(name="sourceDataStore", required=true)
    private final Input<DataStoreInfoBaseArgs> sourceDataStore;

    public Input<DataStoreInfoBaseArgs> getSourceDataStore() {
        return this.sourceDataStore;
    }

    @InputImport(name="targetDataStoreCopySettings")
    private final @Nullable Input<List<TargetCopySettingArgs>> targetDataStoreCopySettings;

    public Input<List<TargetCopySettingArgs>> getTargetDataStoreCopySettings() {
        return this.targetDataStoreCopySettings == null ? Input.empty() : this.targetDataStoreCopySettings;
    }

    public SourceLifeCycleArgs(
        Input<AbsoluteDeleteOptionArgs> deleteAfter,
        Input<DataStoreInfoBaseArgs> sourceDataStore,
        @Nullable Input<List<TargetCopySettingArgs>> targetDataStoreCopySettings) {
        this.deleteAfter = Objects.requireNonNull(deleteAfter, "expected parameter 'deleteAfter' to be non-null");
        this.sourceDataStore = Objects.requireNonNull(sourceDataStore, "expected parameter 'sourceDataStore' to be non-null");
        this.targetDataStoreCopySettings = targetDataStoreCopySettings;
    }

    private SourceLifeCycleArgs() {
        this.deleteAfter = Input.empty();
        this.sourceDataStore = Input.empty();
        this.targetDataStoreCopySettings = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceLifeCycleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<AbsoluteDeleteOptionArgs> deleteAfter;
        private Input<DataStoreInfoBaseArgs> sourceDataStore;
        private @Nullable Input<List<TargetCopySettingArgs>> targetDataStoreCopySettings;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceLifeCycleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteAfter = defaults.deleteAfter;
    	      this.sourceDataStore = defaults.sourceDataStore;
    	      this.targetDataStoreCopySettings = defaults.targetDataStoreCopySettings;
        }

        public Builder setDeleteAfter(Input<AbsoluteDeleteOptionArgs> deleteAfter) {
            this.deleteAfter = Objects.requireNonNull(deleteAfter);
            return this;
        }

        public Builder setDeleteAfter(AbsoluteDeleteOptionArgs deleteAfter) {
            this.deleteAfter = Input.of(Objects.requireNonNull(deleteAfter));
            return this;
        }

        public Builder setSourceDataStore(Input<DataStoreInfoBaseArgs> sourceDataStore) {
            this.sourceDataStore = Objects.requireNonNull(sourceDataStore);
            return this;
        }

        public Builder setSourceDataStore(DataStoreInfoBaseArgs sourceDataStore) {
            this.sourceDataStore = Input.of(Objects.requireNonNull(sourceDataStore));
            return this;
        }

        public Builder setTargetDataStoreCopySettings(@Nullable Input<List<TargetCopySettingArgs>> targetDataStoreCopySettings) {
            this.targetDataStoreCopySettings = targetDataStoreCopySettings;
            return this;
        }

        public Builder setTargetDataStoreCopySettings(@Nullable List<TargetCopySettingArgs> targetDataStoreCopySettings) {
            this.targetDataStoreCopySettings = Input.ofNullable(targetDataStoreCopySettings);
            return this;
        }

        public SourceLifeCycleArgs build() {
            return new SourceLifeCycleArgs(deleteAfter, sourceDataStore, targetDataStoreCopySettings);
        }
    }
}
