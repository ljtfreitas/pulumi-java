// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apikeys_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A restriction for a specific service and optionally one or multiple specific methods. Both fields are case insensitive.
 * 
 */
public final class V2ApiTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final V2ApiTargetArgs Empty = new V2ApiTargetArgs();

    /**
     * Optional. List of one or more methods that can be called. If empty, all methods for the service are allowed. A wildcard (*) can be used as the last symbol. Valid examples: `google.cloud.translate.v2.TranslateService.GetSupportedLanguage` `TranslateText` `Get*` `translate.googleapis.com.Get*`
     * 
     */
    @InputImport(name="methods")
      private final @Nullable Input<List<String>> methods;

    public Input<List<String>> getMethods() {
        return this.methods == null ? Input.empty() : this.methods;
    }

    /**
     * The service for this restriction. It should be the canonical service name, for example: `translate.googleapis.com`. You can use [`gcloud services list`](/sdk/gcloud/reference/services/list) to get a list of services that are enabled in the project.
     * 
     */
    @InputImport(name="service")
      private final @Nullable Input<String> service;

    public Input<String> getService() {
        return this.service == null ? Input.empty() : this.service;
    }

    public V2ApiTargetArgs(
        @Nullable Input<List<String>> methods,
        @Nullable Input<String> service) {
        this.methods = methods;
        this.service = service;
    }

    private V2ApiTargetArgs() {
        this.methods = Input.empty();
        this.service = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(V2ApiTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> methods;
        private @Nullable Input<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(V2ApiTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.methods = defaults.methods;
    	      this.service = defaults.service;
        }

        public Builder setMethods(@Nullable Input<List<String>> methods) {
            this.methods = methods;
            return this;
        }

        public Builder setMethods(@Nullable List<String> methods) {
            this.methods = Input.ofNullable(methods);
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
        public V2ApiTargetArgs build() {
            return new V2ApiTargetArgs(methods, service);
        }
    }
}
