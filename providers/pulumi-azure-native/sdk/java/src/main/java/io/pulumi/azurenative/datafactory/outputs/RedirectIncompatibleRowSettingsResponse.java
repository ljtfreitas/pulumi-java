// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RedirectIncompatibleRowSettingsResponse {
    /**
     * Name of the Azure Storage, Storage SAS, or Azure Data Lake Store linked service used for redirecting incompatible row. Must be specified if redirectIncompatibleRowSettings is specified. Type: string (or Expression with resultType string).
     * 
     */
    private final Object linkedServiceName;
    /**
     * The path for storing the redirect incompatible row data. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object path;

    @OutputCustomType.Constructor({"linkedServiceName","path"})
    private RedirectIncompatibleRowSettingsResponse(
        Object linkedServiceName,
        @Nullable Object path) {
        this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
        this.path = path;
    }

    /**
     * Name of the Azure Storage, Storage SAS, or Azure Data Lake Store linked service used for redirecting incompatible row. Must be specified if redirectIncompatibleRowSettings is specified. Type: string (or Expression with resultType string).
     * 
     */
    public Object getLinkedServiceName() {
        return this.linkedServiceName;
    }
    /**
     * The path for storing the redirect incompatible row data. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getPath() {
        return Optional.ofNullable(this.path);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RedirectIncompatibleRowSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object linkedServiceName;
        private @Nullable Object path;

        public Builder() {
    	      // Empty
        }

        public Builder(RedirectIncompatibleRowSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkedServiceName = defaults.linkedServiceName;
    	      this.path = defaults.path;
        }

        public Builder setLinkedServiceName(Object linkedServiceName) {
            this.linkedServiceName = Objects.requireNonNull(linkedServiceName);
            return this;
        }

        public Builder setPath(@Nullable Object path) {
            this.path = path;
            return this;
        }
        public RedirectIncompatibleRowSettingsResponse build() {
            return new RedirectIncompatibleRowSettingsResponse(linkedServiceName, path);
        }
    }
}
