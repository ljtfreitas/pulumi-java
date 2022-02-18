// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RefreshDetailsResponse {
    /**
     * Indicates the relative path of the error xml for the last refresh job on this particular share or container, if any. This could be a failed job or a successful job.
     * 
     */
    private final @Nullable String errorManifestFile;
    /**
     * If a refresh job is currently in progress on this share or container, this field indicates the ARM resource ID of that job. The field is empty if no job is in progress.
     * 
     */
    private final @Nullable String inProgressRefreshJobId;
    /**
     * Indicates the completed time for the last refresh job on this particular share or container, if any.This could be a failed job or a successful job.
     * 
     */
    private final @Nullable String lastCompletedRefreshJobTimeInUTC;
    /**
     * Indicates the id of the last refresh job on this particular share or container,if any. This could be a failed job or a successful job.
     * 
     */
    private final @Nullable String lastJob;

    @OutputCustomType.Constructor({"errorManifestFile","inProgressRefreshJobId","lastCompletedRefreshJobTimeInUTC","lastJob"})
    private RefreshDetailsResponse(
        @Nullable String errorManifestFile,
        @Nullable String inProgressRefreshJobId,
        @Nullable String lastCompletedRefreshJobTimeInUTC,
        @Nullable String lastJob) {
        this.errorManifestFile = errorManifestFile;
        this.inProgressRefreshJobId = inProgressRefreshJobId;
        this.lastCompletedRefreshJobTimeInUTC = lastCompletedRefreshJobTimeInUTC;
        this.lastJob = lastJob;
    }

    /**
     * Indicates the relative path of the error xml for the last refresh job on this particular share or container, if any. This could be a failed job or a successful job.
     * 
     */
    public Optional<String> getErrorManifestFile() {
        return Optional.ofNullable(this.errorManifestFile);
    }
    /**
     * If a refresh job is currently in progress on this share or container, this field indicates the ARM resource ID of that job. The field is empty if no job is in progress.
     * 
     */
    public Optional<String> getInProgressRefreshJobId() {
        return Optional.ofNullable(this.inProgressRefreshJobId);
    }
    /**
     * Indicates the completed time for the last refresh job on this particular share or container, if any.This could be a failed job or a successful job.
     * 
     */
    public Optional<String> getLastCompletedRefreshJobTimeInUTC() {
        return Optional.ofNullable(this.lastCompletedRefreshJobTimeInUTC);
    }
    /**
     * Indicates the id of the last refresh job on this particular share or container,if any. This could be a failed job or a successful job.
     * 
     */
    public Optional<String> getLastJob() {
        return Optional.ofNullable(this.lastJob);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RefreshDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String errorManifestFile;
        private @Nullable String inProgressRefreshJobId;
        private @Nullable String lastCompletedRefreshJobTimeInUTC;
        private @Nullable String lastJob;

        public Builder() {
    	      // Empty
        }

        public Builder(RefreshDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errorManifestFile = defaults.errorManifestFile;
    	      this.inProgressRefreshJobId = defaults.inProgressRefreshJobId;
    	      this.lastCompletedRefreshJobTimeInUTC = defaults.lastCompletedRefreshJobTimeInUTC;
    	      this.lastJob = defaults.lastJob;
        }

        public Builder setErrorManifestFile(@Nullable String errorManifestFile) {
            this.errorManifestFile = errorManifestFile;
            return this;
        }

        public Builder setInProgressRefreshJobId(@Nullable String inProgressRefreshJobId) {
            this.inProgressRefreshJobId = inProgressRefreshJobId;
            return this;
        }

        public Builder setLastCompletedRefreshJobTimeInUTC(@Nullable String lastCompletedRefreshJobTimeInUTC) {
            this.lastCompletedRefreshJobTimeInUTC = lastCompletedRefreshJobTimeInUTC;
            return this;
        }

        public Builder setLastJob(@Nullable String lastJob) {
            this.lastJob = lastJob;
            return this;
        }

        public RefreshDetailsResponse build() {
            return new RefreshDetailsResponse(errorManifestFile, inProgressRefreshJobId, lastCompletedRefreshJobTimeInUTC, lastJob);
        }
    }
}
