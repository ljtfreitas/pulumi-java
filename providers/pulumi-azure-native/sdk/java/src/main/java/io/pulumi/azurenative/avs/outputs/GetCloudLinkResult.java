// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetCloudLinkResult {
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Identifier of the other private cloud participating in the link.
     * 
     */
    private final @Nullable String linkedCloud;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The state of the cloud link.
     * 
     */
    private final String status;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","linkedCloud","name","status","type"})
    private GetCloudLinkResult(
        String id,
        @Nullable String linkedCloud,
        String name,
        String status,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.linkedCloud = linkedCloud;
        this.name = Objects.requireNonNull(name);
        this.status = Objects.requireNonNull(status);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Resource ID.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Identifier of the other private cloud participating in the link.
     * 
     */
    public Optional<String> getLinkedCloud() {
        return Optional.ofNullable(this.linkedCloud);
    }
    /**
     * Resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The state of the cloud link.
     * 
     */
    public String getStatus() {
        return this.status;
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudLinkResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String linkedCloud;
        private String name;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCloudLinkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.linkedCloud = defaults.linkedCloud;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLinkedCloud(@Nullable String linkedCloud) {
            this.linkedCloud = linkedCloud;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetCloudLinkResult build() {
            return new GetCloudLinkResult(id, linkedCloud, name, status, type);
        }
    }
}
