// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.inputs.DateAfterCreationResponse;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Management policy action for snapshot.
 * 
 */
public final class ManagementPolicySnapShotResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagementPolicySnapShotResponse Empty = new ManagementPolicySnapShotResponse();

    /**
     * The function to delete the blob snapshot
     * 
     */
    @Import(name="delete")
      private final @Nullable DateAfterCreationResponse delete;

    public Optional<DateAfterCreationResponse> getDelete() {
        return this.delete == null ? Optional.empty() : Optional.ofNullable(this.delete);
    }

    /**
     * The function to tier blob snapshot to archive storage. Support blob snapshot currently at Hot or Cool tier
     * 
     */
    @Import(name="tierToArchive")
      private final @Nullable DateAfterCreationResponse tierToArchive;

    public Optional<DateAfterCreationResponse> getTierToArchive() {
        return this.tierToArchive == null ? Optional.empty() : Optional.ofNullable(this.tierToArchive);
    }

    /**
     * The function to tier blob snapshot to cool storage. Support blob snapshot currently at Hot tier
     * 
     */
    @Import(name="tierToCool")
      private final @Nullable DateAfterCreationResponse tierToCool;

    public Optional<DateAfterCreationResponse> getTierToCool() {
        return this.tierToCool == null ? Optional.empty() : Optional.ofNullable(this.tierToCool);
    }

    public ManagementPolicySnapShotResponse(
        @Nullable DateAfterCreationResponse delete,
        @Nullable DateAfterCreationResponse tierToArchive,
        @Nullable DateAfterCreationResponse tierToCool) {
        this.delete = delete;
        this.tierToArchive = tierToArchive;
        this.tierToCool = tierToCool;
    }

    private ManagementPolicySnapShotResponse() {
        this.delete = null;
        this.tierToArchive = null;
        this.tierToCool = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementPolicySnapShotResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DateAfterCreationResponse delete;
        private @Nullable DateAfterCreationResponse tierToArchive;
        private @Nullable DateAfterCreationResponse tierToCool;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementPolicySnapShotResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delete = defaults.delete;
    	      this.tierToArchive = defaults.tierToArchive;
    	      this.tierToCool = defaults.tierToCool;
        }

        public Builder delete(@Nullable DateAfterCreationResponse delete) {
            this.delete = delete;
            return this;
        }

        public Builder tierToArchive(@Nullable DateAfterCreationResponse tierToArchive) {
            this.tierToArchive = tierToArchive;
            return this;
        }

        public Builder tierToCool(@Nullable DateAfterCreationResponse tierToCool) {
            this.tierToCool = tierToCool;
            return this;
        }
        public ManagementPolicySnapShotResponse build() {
            return new ManagementPolicySnapShotResponse(delete, tierToArchive, tierToCool);
        }
    }
}
