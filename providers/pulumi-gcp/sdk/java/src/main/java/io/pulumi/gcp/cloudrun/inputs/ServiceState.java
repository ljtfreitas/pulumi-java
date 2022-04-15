// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.cloudrun.inputs.ServiceMetadataGetArgs;
import io.pulumi.gcp.cloudrun.inputs.ServiceStatusGetArgs;
import io.pulumi.gcp.cloudrun.inputs.ServiceTemplateGetArgs;
import io.pulumi.gcp.cloudrun.inputs.ServiceTrafficGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceState extends io.pulumi.resources.ResourceArgs {

    public static final ServiceState Empty = new ServiceState();

    /**
     * If set to `true`, the revision name (template.metadata.name) will be omitted and
     * autogenerated by Cloud Run. This cannot be set to `true` while `template.metadata.name`
     * is also set.
     * (For legacy support, if `template.metadata.name` is unset in state while
     * this field is set to false, the revision name will still autogenerate.)
     * 
     */
    @Import(name="autogenerateRevisionName")
      private final @Nullable Output<Boolean> autogenerateRevisionName;

    public Output<Boolean> autogenerateRevisionName() {
        return this.autogenerateRevisionName == null ? Codegen.empty() : this.autogenerateRevisionName;
    }

    /**
     * The location of the cloud run instance. eg us-central1
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Metadata associated with this Service, including name, namespace, labels,
     * and annotations.
     * Structure is documented below.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<ServiceMetadataGetArgs> metadata;

    public Output<ServiceMetadataGetArgs> metadata() {
        return this.metadata == null ? Codegen.empty() : this.metadata;
    }

    /**
     * Volume's name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The current status of the Service.
     * 
     */
    @Import(name="statuses")
      private final @Nullable Output<List<ServiceStatusGetArgs>> statuses;

    public Output<List<ServiceStatusGetArgs>> statuses() {
        return this.statuses == null ? Codegen.empty() : this.statuses;
    }

    /**
     * template holds the latest specification for the Revision to
     * be stamped out. The template references the container image, and may also
     * include labels and annotations that should be attached to the Revision.
     * To correlate a Revision, and/or to force a Revision to be created when the
     * spec doesn't otherwise change, a nonce label may be provided in the
     * template metadata. For more details, see:
     * https://github.com/knative/serving/blob/master/docs/client-conventions.md#associate-modifications-with-revisions
     * Cloud Run does not currently support referencing a build that is
     * responsible for materializing the container image from source.
     * Structure is documented below.
     * 
     */
    @Import(name="template")
      private final @Nullable Output<ServiceTemplateGetArgs> template;

    public Output<ServiceTemplateGetArgs> template() {
        return this.template == null ? Codegen.empty() : this.template;
    }

    /**
     * Traffic specifies how to distribute traffic over a collection of Knative Revisions
     * and Configurations
     * Structure is documented below.
     * 
     */
    @Import(name="traffics")
      private final @Nullable Output<List<ServiceTrafficGetArgs>> traffics;

    public Output<List<ServiceTrafficGetArgs>> traffics() {
        return this.traffics == null ? Codegen.empty() : this.traffics;
    }

    public ServiceState(
        @Nullable Output<Boolean> autogenerateRevisionName,
        @Nullable Output<String> location,
        @Nullable Output<ServiceMetadataGetArgs> metadata,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<List<ServiceStatusGetArgs>> statuses,
        @Nullable Output<ServiceTemplateGetArgs> template,
        @Nullable Output<List<ServiceTrafficGetArgs>> traffics) {
        this.autogenerateRevisionName = autogenerateRevisionName;
        this.location = location;
        this.metadata = metadata;
        this.name = name;
        this.project = project;
        this.statuses = statuses;
        this.template = template;
        this.traffics = traffics;
    }

    private ServiceState() {
        this.autogenerateRevisionName = Codegen.empty();
        this.location = Codegen.empty();
        this.metadata = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.statuses = Codegen.empty();
        this.template = Codegen.empty();
        this.traffics = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> autogenerateRevisionName;
        private @Nullable Output<String> location;
        private @Nullable Output<ServiceMetadataGetArgs> metadata;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<List<ServiceStatusGetArgs>> statuses;
        private @Nullable Output<ServiceTemplateGetArgs> template;
        private @Nullable Output<List<ServiceTrafficGetArgs>> traffics;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autogenerateRevisionName = defaults.autogenerateRevisionName;
    	      this.location = defaults.location;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.statuses = defaults.statuses;
    	      this.template = defaults.template;
    	      this.traffics = defaults.traffics;
        }

        public Builder autogenerateRevisionName(@Nullable Output<Boolean> autogenerateRevisionName) {
            this.autogenerateRevisionName = autogenerateRevisionName;
            return this;
        }
        public Builder autogenerateRevisionName(@Nullable Boolean autogenerateRevisionName) {
            this.autogenerateRevisionName = Codegen.ofNullable(autogenerateRevisionName);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder metadata(@Nullable Output<ServiceMetadataGetArgs> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable ServiceMetadataGetArgs metadata) {
            this.metadata = Codegen.ofNullable(metadata);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder statuses(@Nullable Output<List<ServiceStatusGetArgs>> statuses) {
            this.statuses = statuses;
            return this;
        }
        public Builder statuses(@Nullable List<ServiceStatusGetArgs> statuses) {
            this.statuses = Codegen.ofNullable(statuses);
            return this;
        }
        public Builder statuses(ServiceStatusGetArgs... statuses) {
            return statuses(List.of(statuses));
        }
        public Builder template(@Nullable Output<ServiceTemplateGetArgs> template) {
            this.template = template;
            return this;
        }
        public Builder template(@Nullable ServiceTemplateGetArgs template) {
            this.template = Codegen.ofNullable(template);
            return this;
        }
        public Builder traffics(@Nullable Output<List<ServiceTrafficGetArgs>> traffics) {
            this.traffics = traffics;
            return this;
        }
        public Builder traffics(@Nullable List<ServiceTrafficGetArgs> traffics) {
            this.traffics = Codegen.ofNullable(traffics);
            return this;
        }
        public Builder traffics(ServiceTrafficGetArgs... traffics) {
            return traffics(List.of(traffics));
        }        public ServiceState build() {
            return new ServiceState(autogenerateRevisionName, location, metadata, name, project, statuses, template, traffics);
        }
    }
}
