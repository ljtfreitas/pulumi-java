// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.outputs;

import io.pulumi.azurenative.resources.outputs.ErrorResponseResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ScriptStatusResponse {
    /**
     * ACI resource Id.
     * 
     */
    private final String containerInstanceId;
    /**
     * End time of the script execution.
     * 
     */
    private final String endTime;
    /**
     * Error that is relayed from the script execution.
     * 
     */
    private final @Nullable ErrorResponseResponse error;
    /**
     * Time the deployment script resource will expire.
     * 
     */
    private final String expirationTime;
    /**
     * Start time of the script execution.
     * 
     */
    private final String startTime;
    /**
     * Storage account resource Id.
     * 
     */
    private final String storageAccountId;

    @OutputCustomType.Constructor({"containerInstanceId","endTime","error","expirationTime","startTime","storageAccountId"})
    private ScriptStatusResponse(
        String containerInstanceId,
        String endTime,
        @Nullable ErrorResponseResponse error,
        String expirationTime,
        String startTime,
        String storageAccountId) {
        this.containerInstanceId = Objects.requireNonNull(containerInstanceId);
        this.endTime = Objects.requireNonNull(endTime);
        this.error = error;
        this.expirationTime = Objects.requireNonNull(expirationTime);
        this.startTime = Objects.requireNonNull(startTime);
        this.storageAccountId = Objects.requireNonNull(storageAccountId);
    }

    /**
     * ACI resource Id.
     * 
     */
    public String getContainerInstanceId() {
        return this.containerInstanceId;
    }
    /**
     * End time of the script execution.
     * 
     */
    public String getEndTime() {
        return this.endTime;
    }
    /**
     * Error that is relayed from the script execution.
     * 
     */
    public Optional<ErrorResponseResponse> getError() {
        return Optional.ofNullable(this.error);
    }
    /**
     * Time the deployment script resource will expire.
     * 
     */
    public String getExpirationTime() {
        return this.expirationTime;
    }
    /**
     * Start time of the script execution.
     * 
     */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * Storage account resource Id.
     * 
     */
    public String getStorageAccountId() {
        return this.storageAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScriptStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String containerInstanceId;
        private String endTime;
        private @Nullable ErrorResponseResponse error;
        private String expirationTime;
        private String startTime;
        private String storageAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(ScriptStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerInstanceId = defaults.containerInstanceId;
    	      this.endTime = defaults.endTime;
    	      this.error = defaults.error;
    	      this.expirationTime = defaults.expirationTime;
    	      this.startTime = defaults.startTime;
    	      this.storageAccountId = defaults.storageAccountId;
        }

        public Builder setContainerInstanceId(String containerInstanceId) {
            this.containerInstanceId = Objects.requireNonNull(containerInstanceId);
            return this;
        }

        public Builder setEndTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }

        public Builder setError(@Nullable ErrorResponseResponse error) {
            this.error = error;
            return this;
        }

        public Builder setExpirationTime(String expirationTime) {
            this.expirationTime = Objects.requireNonNull(expirationTime);
            return this;
        }

        public Builder setStartTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }

        public Builder setStorageAccountId(String storageAccountId) {
            this.storageAccountId = Objects.requireNonNull(storageAccountId);
            return this;
        }
        public ScriptStatusResponse build() {
            return new ScriptStatusResponse(containerInstanceId, endTime, error, expirationTime, startTime, storageAccountId);
        }
    }
}
