// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.LinkedServiceReferenceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LogLocationSettingsResponse {
    /**
     * Log storage linked service reference.
     * 
     */
    private final LinkedServiceReferenceResponse linkedServiceName;
    /**
     * The path to storage for storing detailed logs of activity execution. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object path;

    @OutputCustomType.Constructor({"linkedServiceName","path"})
    private LogLocationSettingsResponse(
        LinkedServiceReferenceResponse linkedServiceName,
        @Nullable Object path) {
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
        this.path = path;
    }

    /**
     * Log storage linked service reference.
     * 
     */
    public LinkedServiceReferenceResponse getLinkedServiceName() {
        return this.linkedServiceName;
    }
    /**
     * The path to storage for storing detailed logs of activity execution. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getPath() {
        return Optional.ofNullable(this.path);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogLocationSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LinkedServiceReferenceResponse linkedServiceName;
        private @Nullable Object path;

        public Builder() {
    	      // Empty
        }

        public Builder(LogLocationSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.path = defaults.path;
        }

        public Builder setLinkedServiceName(LinkedServiceReferenceResponse linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }

        public Builder setPath(@Nullable Object path) {
            this.path = path;
            return this;
        }
        public LogLocationSettingsResponse build() {
            return new LogLocationSettingsResponse(linkedServiceName, path);
        }
    }
}
