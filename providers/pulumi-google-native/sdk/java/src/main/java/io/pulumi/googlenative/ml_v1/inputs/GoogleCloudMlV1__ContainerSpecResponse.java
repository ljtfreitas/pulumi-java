// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__ContainerPortResponse;
import io.pulumi.googlenative.ml_v1.inputs.GoogleCloudMlV1__EnvVarResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GoogleCloudMlV1__ContainerSpecResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudMlV1__ContainerSpecResponse Empty = new GoogleCloudMlV1__ContainerSpecResponse();

    @InputImport(name="args", required=true)
    private final List<String> args;

    public List<String> getArgs() {
        return this.args;
    }

    @InputImport(name="command", required=true)
    private final List<String> command;

    public List<String> getCommand() {
        return this.command;
    }

    @InputImport(name="env", required=true)
    private final List<GoogleCloudMlV1__EnvVarResponse> env;

    public List<GoogleCloudMlV1__EnvVarResponse> getEnv() {
        return this.env;
    }

    @InputImport(name="image", required=true)
    private final String image;

    public String getImage() {
        return this.image;
    }

    @InputImport(name="ports", required=true)
    private final List<GoogleCloudMlV1__ContainerPortResponse> ports;

    public List<GoogleCloudMlV1__ContainerPortResponse> getPorts() {
        return this.ports;
    }

    public GoogleCloudMlV1__ContainerSpecResponse(
        List<String> args,
        List<String> command,
        List<GoogleCloudMlV1__EnvVarResponse> env,
        String image,
        List<GoogleCloudMlV1__ContainerPortResponse> ports) {
        this.args = Objects.requireNonNull(args, "expected parameter 'args' to be non-null");
        this.command = Objects.requireNonNull(command, "expected parameter 'command' to be non-null");
        this.env = Objects.requireNonNull(env, "expected parameter 'env' to be non-null");
        this.image = Objects.requireNonNull(image, "expected parameter 'image' to be non-null");
        this.ports = Objects.requireNonNull(ports, "expected parameter 'ports' to be non-null");
    }

    private GoogleCloudMlV1__ContainerSpecResponse() {
        this.args = List.of();
        this.command = List.of();
        this.env = List.of();
        this.image = null;
        this.ports = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__ContainerSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> args;
        private List<String> command;
        private List<GoogleCloudMlV1__EnvVarResponse> env;
        private String image;
        private List<GoogleCloudMlV1__ContainerPortResponse> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__ContainerSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.command = defaults.command;
    	      this.env = defaults.env;
    	      this.image = defaults.image;
    	      this.ports = defaults.ports;
        }

        public Builder setArgs(List<String> args) {
            this.args = Objects.requireNonNull(args);
            return this;
        }

        public Builder setCommand(List<String> command) {
            this.command = Objects.requireNonNull(command);
            return this;
        }

        public Builder setEnv(List<GoogleCloudMlV1__EnvVarResponse> env) {
            this.env = Objects.requireNonNull(env);
            return this;
        }

        public Builder setImage(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder setPorts(List<GoogleCloudMlV1__ContainerPortResponse> ports) {
            this.ports = Objects.requireNonNull(ports);
            return this;
        }

        public GoogleCloudMlV1__ContainerSpecResponse build() {
            return new GoogleCloudMlV1__ContainerSpecResponse(args, command, env, image, ports);
        }
    }
}