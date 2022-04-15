// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudscheduler.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobAppEngineHttpTargetAppEngineRoutingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobAppEngineHttpTargetAppEngineRoutingGetArgs Empty = new JobAppEngineHttpTargetAppEngineRoutingGetArgs();

    /**
     * App instance.
     * By default, the job is sent to an instance which is available when the job is attempted.
     * 
     */
    @Import(name="instance")
      private final @Nullable Output<String> instance;

    public Output<String> instance() {
        return this.instance == null ? Codegen.empty() : this.instance;
    }

    /**
     * App service.
     * By default, the job is sent to the service which is the default service when the job is attempted.
     * 
     */
    @Import(name="service")
      private final @Nullable Output<String> service;

    public Output<String> service() {
        return this.service == null ? Codegen.empty() : this.service;
    }

    /**
     * App version.
     * By default, the job is sent to the version which is the default version when the job is attempted.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> version() {
        return this.version == null ? Codegen.empty() : this.version;
    }

    public JobAppEngineHttpTargetAppEngineRoutingGetArgs(
        @Nullable Output<String> instance,
        @Nullable Output<String> service,
        @Nullable Output<String> version) {
        this.instance = instance;
        this.service = service;
        this.version = version;
    }

    private JobAppEngineHttpTargetAppEngineRoutingGetArgs() {
        this.instance = Codegen.empty();
        this.service = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobAppEngineHttpTargetAppEngineRoutingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> instance;
        private @Nullable Output<String> service;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(JobAppEngineHttpTargetAppEngineRoutingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instance = defaults.instance;
    	      this.service = defaults.service;
    	      this.version = defaults.version;
        }

        public Builder instance(@Nullable Output<String> instance) {
            this.instance = instance;
            return this;
        }
        public Builder instance(@Nullable String instance) {
            this.instance = Codegen.ofNullable(instance);
            return this;
        }
        public Builder service(@Nullable Output<String> service) {
            this.service = service;
            return this;
        }
        public Builder service(@Nullable String service) {
            this.service = Codegen.ofNullable(service);
            return this;
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Codegen.ofNullable(version);
            return this;
        }        public JobAppEngineHttpTargetAppEngineRoutingGetArgs build() {
            return new JobAppEngineHttpTargetAppEngineRoutingGetArgs(instance, service, version);
        }
    }
}
