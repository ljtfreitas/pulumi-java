// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicedirectory_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNamespaceIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNamespaceIamPolicyArgs Empty = new GetNamespaceIamPolicyArgs();

    @Import(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @Import(name="namespaceId", required=true)
      private final String namespaceId;

    public String getNamespaceId() {
        return this.namespaceId;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetNamespaceIamPolicyArgs(
        String location,
        String namespaceId,
        @Nullable String project) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.namespaceId = Objects.requireNonNull(namespaceId, "expected parameter 'namespaceId' to be non-null");
        this.project = project;
    }

    private GetNamespaceIamPolicyArgs() {
        this.location = null;
        this.namespaceId = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNamespaceIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private String namespaceId;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNamespaceIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.namespaceId = defaults.namespaceId;
    	      this.project = defaults.project;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder namespaceId(String namespaceId) {
            this.namespaceId = Objects.requireNonNull(namespaceId);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetNamespaceIamPolicyArgs build() {
            return new GetNamespaceIamPolicyArgs(location, namespaceId, project);
        }
    }
}
