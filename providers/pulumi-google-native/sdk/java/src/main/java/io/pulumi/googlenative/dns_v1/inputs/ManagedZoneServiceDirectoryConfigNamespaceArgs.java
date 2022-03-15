// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedZoneServiceDirectoryConfigNamespaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZoneServiceDirectoryConfigNamespaceArgs Empty = new ManagedZoneServiceDirectoryConfigNamespaceArgs();

    /**
     * The time that the namespace backing this zone was deleted; an empty string if it still exists. This is in RFC3339 text format. Output only.
     * 
     */
    @Import(name="deletionTime")
      private final @Nullable Output<String> deletionTime;

    public Output<String> getDeletionTime() {
        return this.deletionTime == null ? Output.empty() : this.deletionTime;
    }

    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * The fully qualified URL of the namespace associated with the zone. Format must be https://servicedirectory.googleapis.com/v1/projects/{project}/locations/{location}/namespaces/{namespace}
     * 
     */
    @Import(name="namespaceUrl")
      private final @Nullable Output<String> namespaceUrl;

    public Output<String> getNamespaceUrl() {
        return this.namespaceUrl == null ? Output.empty() : this.namespaceUrl;
    }

    public ManagedZoneServiceDirectoryConfigNamespaceArgs(
        @Nullable Output<String> deletionTime,
        @Nullable Output<String> kind,
        @Nullable Output<String> namespaceUrl) {
        this.deletionTime = deletionTime;
        this.kind = kind;
        this.namespaceUrl = namespaceUrl;
    }

    private ManagedZoneServiceDirectoryConfigNamespaceArgs() {
        this.deletionTime = Output.empty();
        this.kind = Output.empty();
        this.namespaceUrl = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneServiceDirectoryConfigNamespaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> deletionTime;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> namespaceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneServiceDirectoryConfigNamespaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deletionTime = defaults.deletionTime;
    	      this.kind = defaults.kind;
    	      this.namespaceUrl = defaults.namespaceUrl;
        }

        public Builder deletionTime(@Nullable Output<String> deletionTime) {
            this.deletionTime = deletionTime;
            return this;
        }

        public Builder deletionTime(@Nullable String deletionTime) {
            this.deletionTime = Output.ofNullable(deletionTime);
            return this;
        }

        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }

        public Builder namespaceUrl(@Nullable Output<String> namespaceUrl) {
            this.namespaceUrl = namespaceUrl;
            return this;
        }

        public Builder namespaceUrl(@Nullable String namespaceUrl) {
            this.namespaceUrl = Output.ofNullable(namespaceUrl);
            return this;
        }
        public ManagedZoneServiceDirectoryConfigNamespaceArgs build() {
            return new ManagedZoneServiceDirectoryConfigNamespaceArgs(deletionTime, kind, namespaceUrl);
        }
    }
}
