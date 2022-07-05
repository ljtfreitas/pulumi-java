// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataplex.v1.inputs.GoogleCloudDataplexV1EnvironmentInfrastructureSpecArgs;
import com.pulumi.googlenative.dataplex.v1.inputs.GoogleCloudDataplexV1EnvironmentSessionSpecArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentArgs Empty = new EnvironmentArgs();

    /**
     * Optional. Description of the environment.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Optional. Description of the environment.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Optional. User friendly display name.
     * 
     */
    @Import(name="displayName")
    private @Nullable Output<String> displayName;

    /**
     * @return Optional. User friendly display name.
     * 
     */
    public Optional<Output<String>> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    /**
     * Required. Environment identifier. * Must contain only lowercase letters, numbers and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end with a number or a letter. * Must be unique within the lake.
     * 
     */
    @Import(name="environmentId", required=true)
    private Output<String> environmentId;

    /**
     * @return Required. Environment identifier. * Must contain only lowercase letters, numbers and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end with a number or a letter. * Must be unique within the lake.
     * 
     */
    public Output<String> environmentId() {
        return this.environmentId;
    }

    /**
     * Infrastructure specification for the Environment.
     * 
     */
    @Import(name="infrastructureSpec", required=true)
    private Output<GoogleCloudDataplexV1EnvironmentInfrastructureSpecArgs> infrastructureSpec;

    /**
     * @return Infrastructure specification for the Environment.
     * 
     */
    public Output<GoogleCloudDataplexV1EnvironmentInfrastructureSpecArgs> infrastructureSpec() {
        return this.infrastructureSpec;
    }

    /**
     * Optional. User defined labels for the environment.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return Optional. User defined labels for the environment.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="lakeId", required=true)
    private Output<String> lakeId;

    public Output<String> lakeId() {
        return this.lakeId;
    }

    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Optional. Configuration for sessions created for this environment.
     * 
     */
    @Import(name="sessionSpec")
    private @Nullable Output<GoogleCloudDataplexV1EnvironmentSessionSpecArgs> sessionSpec;

    /**
     * @return Optional. Configuration for sessions created for this environment.
     * 
     */
    public Optional<Output<GoogleCloudDataplexV1EnvironmentSessionSpecArgs>> sessionSpec() {
        return Optional.ofNullable(this.sessionSpec);
    }

    /**
     * Optional. Only validate the request, but do not perform mutations. The default is false.
     * 
     */
    @Import(name="validateOnly")
    private @Nullable Output<String> validateOnly;

    /**
     * @return Optional. Only validate the request, but do not perform mutations. The default is false.
     * 
     */
    public Optional<Output<String>> validateOnly() {
        return Optional.ofNullable(this.validateOnly);
    }

    private EnvironmentArgs() {}

    private EnvironmentArgs(EnvironmentArgs $) {
        this.description = $.description;
        this.displayName = $.displayName;
        this.environmentId = $.environmentId;
        this.infrastructureSpec = $.infrastructureSpec;
        this.labels = $.labels;
        this.lakeId = $.lakeId;
        this.location = $.location;
        this.project = $.project;
        this.sessionSpec = $.sessionSpec;
        this.validateOnly = $.validateOnly;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentArgs $;

        public Builder() {
            $ = new EnvironmentArgs();
        }

        public Builder(EnvironmentArgs defaults) {
            $ = new EnvironmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Optional. Description of the environment.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Optional. Description of the environment.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param displayName Optional. User friendly display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(@Nullable Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Optional. User friendly display name.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param environmentId Required. Environment identifier. * Must contain only lowercase letters, numbers and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end with a number or a letter. * Must be unique within the lake.
         * 
         * @return builder
         * 
         */
        public Builder environmentId(Output<String> environmentId) {
            $.environmentId = environmentId;
            return this;
        }

        /**
         * @param environmentId Required. Environment identifier. * Must contain only lowercase letters, numbers and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end with a number or a letter. * Must be unique within the lake.
         * 
         * @return builder
         * 
         */
        public Builder environmentId(String environmentId) {
            return environmentId(Output.of(environmentId));
        }

        /**
         * @param infrastructureSpec Infrastructure specification for the Environment.
         * 
         * @return builder
         * 
         */
        public Builder infrastructureSpec(Output<GoogleCloudDataplexV1EnvironmentInfrastructureSpecArgs> infrastructureSpec) {
            $.infrastructureSpec = infrastructureSpec;
            return this;
        }

        /**
         * @param infrastructureSpec Infrastructure specification for the Environment.
         * 
         * @return builder
         * 
         */
        public Builder infrastructureSpec(GoogleCloudDataplexV1EnvironmentInfrastructureSpecArgs infrastructureSpec) {
            return infrastructureSpec(Output.of(infrastructureSpec));
        }

        /**
         * @param labels Optional. User defined labels for the environment.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels Optional. User defined labels for the environment.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder lakeId(Output<String> lakeId) {
            $.lakeId = lakeId;
            return this;
        }

        public Builder lakeId(String lakeId) {
            return lakeId(Output.of(lakeId));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param sessionSpec Optional. Configuration for sessions created for this environment.
         * 
         * @return builder
         * 
         */
        public Builder sessionSpec(@Nullable Output<GoogleCloudDataplexV1EnvironmentSessionSpecArgs> sessionSpec) {
            $.sessionSpec = sessionSpec;
            return this;
        }

        /**
         * @param sessionSpec Optional. Configuration for sessions created for this environment.
         * 
         * @return builder
         * 
         */
        public Builder sessionSpec(GoogleCloudDataplexV1EnvironmentSessionSpecArgs sessionSpec) {
            return sessionSpec(Output.of(sessionSpec));
        }

        /**
         * @param validateOnly Optional. Only validate the request, but do not perform mutations. The default is false.
         * 
         * @return builder
         * 
         */
        public Builder validateOnly(@Nullable Output<String> validateOnly) {
            $.validateOnly = validateOnly;
            return this;
        }

        /**
         * @param validateOnly Optional. Only validate the request, but do not perform mutations. The default is false.
         * 
         * @return builder
         * 
         */
        public Builder validateOnly(String validateOnly) {
            return validateOnly(Output.of(validateOnly));
        }

        public EnvironmentArgs build() {
            $.environmentId = Objects.requireNonNull($.environmentId, "expected parameter 'environmentId' to be non-null");
            $.infrastructureSpec = Objects.requireNonNull($.infrastructureSpec, "expected parameter 'infrastructureSpec' to be non-null");
            $.lakeId = Objects.requireNonNull($.lakeId, "expected parameter 'lakeId' to be non-null");
            return $;
        }
    }

}
