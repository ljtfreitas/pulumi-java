// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceState extends io.pulumi.resources.ResourceArgs {

    public static final ServiceState Empty = new ServiceState();

    /**
     * If `true`, services that are enabled
     * and which depend on this service should also be disabled when this service is
     * destroyed. If `false` or unset, an error will be generated if any enabled
     * services depend on this service when destroying it.
     * 
     */
    @InputImport(name="disableDependentServices")
        private final @Nullable Input<Boolean> disableDependentServices;

    public Input<Boolean> getDisableDependentServices() {
        return this.disableDependentServices == null ? Input.empty() : this.disableDependentServices;
    }

    /**
     * If true, disable the service when the resource is destroyed. Defaults to true. May be useful in the event that a project is long-lived but the infrastructure running in that project changes frequently.
     * 
     */
    @InputImport(name="disableOnDestroy")
        private final @Nullable Input<Boolean> disableOnDestroy;

    public Input<Boolean> getDisableOnDestroy() {
        return this.disableOnDestroy == null ? Input.empty() : this.disableOnDestroy;
    }

    /**
     * The project ID. If not provided, the provider project
     * is used.
     * 
     */
    @InputImport(name="project")
        private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The service to enable.
     * 
     */
    @InputImport(name="service")
        private final @Nullable Input<String> service;

    public Input<String> getService() {
        return this.service == null ? Input.empty() : this.service;
    }

    public ServiceState(
        @Nullable Input<Boolean> disableDependentServices,
        @Nullable Input<Boolean> disableOnDestroy,
        @Nullable Input<String> project,
        @Nullable Input<String> service) {
        this.disableDependentServices = disableDependentServices;
        this.disableOnDestroy = disableOnDestroy;
        this.project = project;
        this.service = service;
    }

    private ServiceState() {
        this.disableDependentServices = Input.empty();
        this.disableOnDestroy = Input.empty();
        this.project = Input.empty();
        this.service = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> disableDependentServices;
        private @Nullable Input<Boolean> disableOnDestroy;
        private @Nullable Input<String> project;
        private @Nullable Input<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableDependentServices = defaults.disableDependentServices;
    	      this.disableOnDestroy = defaults.disableOnDestroy;
    	      this.project = defaults.project;
    	      this.service = defaults.service;
        }

        public Builder setDisableDependentServices(@Nullable Input<Boolean> disableDependentServices) {
            this.disableDependentServices = disableDependentServices;
            return this;
        }

        public Builder setDisableDependentServices(@Nullable Boolean disableDependentServices) {
            this.disableDependentServices = Input.ofNullable(disableDependentServices);
            return this;
        }

        public Builder setDisableOnDestroy(@Nullable Input<Boolean> disableOnDestroy) {
            this.disableOnDestroy = disableOnDestroy;
            return this;
        }

        public Builder setDisableOnDestroy(@Nullable Boolean disableOnDestroy) {
            this.disableOnDestroy = Input.ofNullable(disableOnDestroy);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setService(@Nullable Input<String> service) {
            this.service = service;
            return this;
        }

        public Builder setService(@Nullable String service) {
            this.service = Input.ofNullable(service);
            return this;
        }
        public ServiceState build() {
            return new ServiceState(disableDependentServices, disableOnDestroy, project, service);
        }
    }
}
