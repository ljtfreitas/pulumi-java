// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.outputs;

import io.pulumi.azurenative.dataprotection.outputs.AbsoluteDeleteOptionResponse;
import io.pulumi.azurenative.dataprotection.outputs.DataStoreInfoBaseResponse;
import io.pulumi.azurenative.dataprotection.outputs.TargetCopySettingResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class SourceLifeCycleResponse {
    /**
     * Delete Option
     * 
     */
    private final AbsoluteDeleteOptionResponse deleteAfter;
    /**
     * DataStoreInfo base
     * 
     */
    private final DataStoreInfoBaseResponse sourceDataStore;
    private final @Nullable List<TargetCopySettingResponse> targetDataStoreCopySettings;

    @OutputCustomType.Constructor({"deleteAfter","sourceDataStore","targetDataStoreCopySettings"})
    private SourceLifeCycleResponse(
        AbsoluteDeleteOptionResponse deleteAfter,
        DataStoreInfoBaseResponse sourceDataStore,
        @Nullable List<TargetCopySettingResponse> targetDataStoreCopySettings) {
        this.deleteAfter = Objects.requireNonNull(deleteAfter);
        this.sourceDataStore = Objects.requireNonNull(sourceDataStore);
        this.targetDataStoreCopySettings = targetDataStoreCopySettings;
    }

    /**
     * Delete Option
     * 
     */
    public AbsoluteDeleteOptionResponse getDeleteAfter() {
        return this.deleteAfter;
    }
    /**
     * DataStoreInfo base
     * 
     */
    public DataStoreInfoBaseResponse getSourceDataStore() {
        return this.sourceDataStore;
    }
    public List<TargetCopySettingResponse> getTargetDataStoreCopySettings() {
        return this.targetDataStoreCopySettings == null ? List.of() : this.targetDataStoreCopySettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceLifeCycleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AbsoluteDeleteOptionResponse deleteAfter;
        private DataStoreInfoBaseResponse sourceDataStore;
        private @Nullable List<TargetCopySettingResponse> targetDataStoreCopySettings;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceLifeCycleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteAfter = defaults.deleteAfter;
    	      this.sourceDataStore = defaults.sourceDataStore;
    	      this.targetDataStoreCopySettings = defaults.targetDataStoreCopySettings;
        }

        public Builder setDeleteAfter(AbsoluteDeleteOptionResponse deleteAfter) {
            this.deleteAfter = Objects.requireNonNull(deleteAfter);
            return this;
        }

        public Builder setSourceDataStore(DataStoreInfoBaseResponse sourceDataStore) {
            this.sourceDataStore = Objects.requireNonNull(sourceDataStore);
            return this;
        }

        public Builder setTargetDataStoreCopySettings(@Nullable List<TargetCopySettingResponse> targetDataStoreCopySettings) {
            this.targetDataStoreCopySettings = targetDataStoreCopySettings;
            return this;
        }

        public SourceLifeCycleResponse build() {
            return new SourceLifeCycleResponse(deleteAfter, sourceDataStore, targetDataStoreCopySettings);
        }
    }
}
