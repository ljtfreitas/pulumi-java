// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.core_v1.inputs.ContainerPortArgs;
import io.pulumi.kubernetes.core_v1.inputs.EnvFromSourceArgs;
import io.pulumi.kubernetes.core_v1.inputs.EnvVarArgs;
import io.pulumi.kubernetes.core_v1.inputs.LifecycleArgs;
import io.pulumi.kubernetes.core_v1.inputs.ProbeArgs;
import io.pulumi.kubernetes.core_v1.inputs.ResourceRequirementsArgs;
import io.pulumi.kubernetes.core_v1.inputs.SecurityContextArgs;
import io.pulumi.kubernetes.core_v1.inputs.VolumeDeviceArgs;
import io.pulumi.kubernetes.core_v1.inputs.VolumeMountArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An EphemeralContainer is a temporary container that you may add to an existing Pod for user-initiated activities such as debugging. Ephemeral containers have no resource or scheduling guarantees, and they will not be restarted when they exit or when a Pod is removed or restarted. The kubelet may evict a Pod if an ephemeral container causes the Pod to exceed its resource allocation.
 * 
 * To add an ephemeral container, use the ephemeralcontainers subresource of an existing Pod. Ephemeral containers may not be removed or restarted.
 * 
 * This is a beta feature available on clusters that haven't disabled the EphemeralContainers feature gate.
 * 
 */
public final class EphemeralContainerArgs extends io.pulumi.resources.ResourceArgs {

    public static final EphemeralContainerArgs Empty = new EphemeralContainerArgs();

    /**
     * Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @Import(name="args")
      private final @Nullable Output<List<String>> args;

    public Output<List<String>> getArgs() {
        return this.args == null ? Output.empty() : this.args;
    }

    /**
     * Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. "$$(VAR_NAME)" will produce the string literal "$(VAR_NAME)". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @Import(name="command")
      private final @Nullable Output<List<String>> command;

    public Output<List<String>> getCommand() {
        return this.command == null ? Output.empty() : this.command;
    }

    /**
     * List of environment variables to set in the container. Cannot be updated.
     * 
     */
    @Import(name="env")
      private final @Nullable Output<List<EnvVarArgs>> env;

    public Output<List<EnvVarArgs>> getEnv() {
        return this.env == null ? Output.empty() : this.env;
    }

    /**
     * List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
     * 
     */
    @Import(name="envFrom")
      private final @Nullable Output<List<EnvFromSourceArgs>> envFrom;

    public Output<List<EnvFromSourceArgs>> getEnvFrom() {
        return this.envFrom == null ? Output.empty() : this.envFrom;
    }

    /**
     * Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images
     * 
     */
    @Import(name="image")
      private final @Nullable Output<String> image;

    public Output<String> getImage() {
        return this.image == null ? Output.empty() : this.image;
    }

    /**
     * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
     * 
     * Possible enum values:
     *  - `"Always"` means that kubelet always attempts to pull the latest image. Container will fail If the pull fails.
     *  - `"IfNotPresent"` means that kubelet pulls if the image isn't present on disk. Container will fail if the image isn't present and the pull fails.
     *  - `"Never"` means that kubelet never pulls an image, but only uses a local image. Container will fail if the image isn't present
     * 
     */
    @Import(name="imagePullPolicy")
      private final @Nullable Output<String> imagePullPolicy;

    public Output<String> getImagePullPolicy() {
        return this.imagePullPolicy == null ? Output.empty() : this.imagePullPolicy;
    }

    /**
     * Lifecycle is not allowed for ephemeral containers.
     * 
     */
    @Import(name="lifecycle")
      private final @Nullable Output<LifecycleArgs> lifecycle;

    public Output<LifecycleArgs> getLifecycle() {
        return this.lifecycle == null ? Output.empty() : this.lifecycle;
    }

    /**
     * Probes are not allowed for ephemeral containers.
     * 
     */
    @Import(name="livenessProbe")
      private final @Nullable Output<ProbeArgs> livenessProbe;

    public Output<ProbeArgs> getLivenessProbe() {
        return this.livenessProbe == null ? Output.empty() : this.livenessProbe;
    }

    /**
     * Name of the ephemeral container specified as a DNS_LABEL. This name must be unique among all containers, init containers and ephemeral containers.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Ports are not allowed for ephemeral containers.
     * 
     */
    @Import(name="ports")
      private final @Nullable Output<List<ContainerPortArgs>> ports;

    public Output<List<ContainerPortArgs>> getPorts() {
        return this.ports == null ? Output.empty() : this.ports;
    }

    /**
     * Probes are not allowed for ephemeral containers.
     * 
     */
    @Import(name="readinessProbe")
      private final @Nullable Output<ProbeArgs> readinessProbe;

    public Output<ProbeArgs> getReadinessProbe() {
        return this.readinessProbe == null ? Output.empty() : this.readinessProbe;
    }

    /**
     * Resources are not allowed for ephemeral containers. Ephemeral containers use spare resources already allocated to the pod.
     * 
     */
    @Import(name="resources")
      private final @Nullable Output<ResourceRequirementsArgs> resources;

    public Output<ResourceRequirementsArgs> getResources() {
        return this.resources == null ? Output.empty() : this.resources;
    }

    /**
     * Optional: SecurityContext defines the security options the ephemeral container should be run with. If set, the fields of SecurityContext override the equivalent fields of PodSecurityContext.
     * 
     */
    @Import(name="securityContext")
      private final @Nullable Output<SecurityContextArgs> securityContext;

    public Output<SecurityContextArgs> getSecurityContext() {
        return this.securityContext == null ? Output.empty() : this.securityContext;
    }

    /**
     * Probes are not allowed for ephemeral containers.
     * 
     */
    @Import(name="startupProbe")
      private final @Nullable Output<ProbeArgs> startupProbe;

    public Output<ProbeArgs> getStartupProbe() {
        return this.startupProbe == null ? Output.empty() : this.startupProbe;
    }

    /**
     * Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.
     * 
     */
    @Import(name="stdin")
      private final @Nullable Output<Boolean> stdin;

    public Output<Boolean> getStdin() {
        return this.stdin == null ? Output.empty() : this.stdin;
    }

    /**
     * Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false
     * 
     */
    @Import(name="stdinOnce")
      private final @Nullable Output<Boolean> stdinOnce;

    public Output<Boolean> getStdinOnce() {
        return this.stdinOnce == null ? Output.empty() : this.stdinOnce;
    }

    /**
     * If set, the name of the container from PodSpec that this ephemeral container targets. The ephemeral container will be run in the namespaces (IPC, PID, etc) of this container. If not set then the ephemeral container uses the namespaces configured in the Pod spec.
     * 
     * The container runtime must implement support for this feature. If the runtime does not support namespace targeting then the result of setting this field is undefined.
     * 
     */
    @Import(name="targetContainerName")
      private final @Nullable Output<String> targetContainerName;

    public Output<String> getTargetContainerName() {
        return this.targetContainerName == null ? Output.empty() : this.targetContainerName;
    }

    /**
     * Optional: Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
     * 
     */
    @Import(name="terminationMessagePath")
      private final @Nullable Output<String> terminationMessagePath;

    public Output<String> getTerminationMessagePath() {
        return this.terminationMessagePath == null ? Output.empty() : this.terminationMessagePath;
    }

    /**
     * Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
     * 
     * Possible enum values:
     *  - `"FallbackToLogsOnError"` will read the most recent contents of the container logs for the container status message when the container exits with an error and the terminationMessagePath has no contents.
     *  - `"File"` is the default behavior and will set the container status message to the contents of the container's terminationMessagePath when the container exits.
     * 
     */
    @Import(name="terminationMessagePolicy")
      private final @Nullable Output<String> terminationMessagePolicy;

    public Output<String> getTerminationMessagePolicy() {
        return this.terminationMessagePolicy == null ? Output.empty() : this.terminationMessagePolicy;
    }

    /**
     * Whether this container should allocate a TTY for itself, also requires 'stdin' to be true. Default is false.
     * 
     */
    @Import(name="tty")
      private final @Nullable Output<Boolean> tty;

    public Output<Boolean> getTty() {
        return this.tty == null ? Output.empty() : this.tty;
    }

    /**
     * volumeDevices is the list of block devices to be used by the container.
     * 
     */
    @Import(name="volumeDevices")
      private final @Nullable Output<List<VolumeDeviceArgs>> volumeDevices;

    public Output<List<VolumeDeviceArgs>> getVolumeDevices() {
        return this.volumeDevices == null ? Output.empty() : this.volumeDevices;
    }

    /**
     * Pod volumes to mount into the container's filesystem. Subpath mounts are not allowed for ephemeral containers. Cannot be updated.
     * 
     */
    @Import(name="volumeMounts")
      private final @Nullable Output<List<VolumeMountArgs>> volumeMounts;

    public Output<List<VolumeMountArgs>> getVolumeMounts() {
        return this.volumeMounts == null ? Output.empty() : this.volumeMounts;
    }

    /**
     * Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.
     * 
     */
    @Import(name="workingDir")
      private final @Nullable Output<String> workingDir;

    public Output<String> getWorkingDir() {
        return this.workingDir == null ? Output.empty() : this.workingDir;
    }

    public EphemeralContainerArgs(
        @Nullable Output<List<String>> args,
        @Nullable Output<List<String>> command,
        @Nullable Output<List<EnvVarArgs>> env,
        @Nullable Output<List<EnvFromSourceArgs>> envFrom,
        @Nullable Output<String> image,
        @Nullable Output<String> imagePullPolicy,
        @Nullable Output<LifecycleArgs> lifecycle,
        @Nullable Output<ProbeArgs> livenessProbe,
        Output<String> name,
        @Nullable Output<List<ContainerPortArgs>> ports,
        @Nullable Output<ProbeArgs> readinessProbe,
        @Nullable Output<ResourceRequirementsArgs> resources,
        @Nullable Output<SecurityContextArgs> securityContext,
        @Nullable Output<ProbeArgs> startupProbe,
        @Nullable Output<Boolean> stdin,
        @Nullable Output<Boolean> stdinOnce,
        @Nullable Output<String> targetContainerName,
        @Nullable Output<String> terminationMessagePath,
        @Nullable Output<String> terminationMessagePolicy,
        @Nullable Output<Boolean> tty,
        @Nullable Output<List<VolumeDeviceArgs>> volumeDevices,
        @Nullable Output<List<VolumeMountArgs>> volumeMounts,
        @Nullable Output<String> workingDir) {
        this.args = args;
        this.command = command;
        this.env = env;
        this.envFrom = envFrom;
        this.image = image;
        this.imagePullPolicy = imagePullPolicy;
        this.lifecycle = lifecycle;
        this.livenessProbe = livenessProbe;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.ports = ports;
        this.readinessProbe = readinessProbe;
        this.resources = resources;
        this.securityContext = securityContext;
        this.startupProbe = startupProbe;
        this.stdin = stdin;
        this.stdinOnce = stdinOnce;
        this.targetContainerName = targetContainerName;
        this.terminationMessagePath = terminationMessagePath;
        this.terminationMessagePolicy = terminationMessagePolicy;
        this.tty = tty;
        this.volumeDevices = volumeDevices;
        this.volumeMounts = volumeMounts;
        this.workingDir = workingDir;
    }

    private EphemeralContainerArgs() {
        this.args = Output.empty();
        this.command = Output.empty();
        this.env = Output.empty();
        this.envFrom = Output.empty();
        this.image = Output.empty();
        this.imagePullPolicy = Output.empty();
        this.lifecycle = Output.empty();
        this.livenessProbe = Output.empty();
        this.name = Output.empty();
        this.ports = Output.empty();
        this.readinessProbe = Output.empty();
        this.resources = Output.empty();
        this.securityContext = Output.empty();
        this.startupProbe = Output.empty();
        this.stdin = Output.empty();
        this.stdinOnce = Output.empty();
        this.targetContainerName = Output.empty();
        this.terminationMessagePath = Output.empty();
        this.terminationMessagePolicy = Output.empty();
        this.tty = Output.empty();
        this.volumeDevices = Output.empty();
        this.volumeMounts = Output.empty();
        this.workingDir = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EphemeralContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> args;
        private @Nullable Output<List<String>> command;
        private @Nullable Output<List<EnvVarArgs>> env;
        private @Nullable Output<List<EnvFromSourceArgs>> envFrom;
        private @Nullable Output<String> image;
        private @Nullable Output<String> imagePullPolicy;
        private @Nullable Output<LifecycleArgs> lifecycle;
        private @Nullable Output<ProbeArgs> livenessProbe;
        private Output<String> name;
        private @Nullable Output<List<ContainerPortArgs>> ports;
        private @Nullable Output<ProbeArgs> readinessProbe;
        private @Nullable Output<ResourceRequirementsArgs> resources;
        private @Nullable Output<SecurityContextArgs> securityContext;
        private @Nullable Output<ProbeArgs> startupProbe;
        private @Nullable Output<Boolean> stdin;
        private @Nullable Output<Boolean> stdinOnce;
        private @Nullable Output<String> targetContainerName;
        private @Nullable Output<String> terminationMessagePath;
        private @Nullable Output<String> terminationMessagePolicy;
        private @Nullable Output<Boolean> tty;
        private @Nullable Output<List<VolumeDeviceArgs>> volumeDevices;
        private @Nullable Output<List<VolumeMountArgs>> volumeMounts;
        private @Nullable Output<String> workingDir;

        public Builder() {
    	      // Empty
        }

        public Builder(EphemeralContainerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.command = defaults.command;
    	      this.env = defaults.env;
    	      this.envFrom = defaults.envFrom;
    	      this.image = defaults.image;
    	      this.imagePullPolicy = defaults.imagePullPolicy;
    	      this.lifecycle = defaults.lifecycle;
    	      this.livenessProbe = defaults.livenessProbe;
    	      this.name = defaults.name;
    	      this.ports = defaults.ports;
    	      this.readinessProbe = defaults.readinessProbe;
    	      this.resources = defaults.resources;
    	      this.securityContext = defaults.securityContext;
    	      this.startupProbe = defaults.startupProbe;
    	      this.stdin = defaults.stdin;
    	      this.stdinOnce = defaults.stdinOnce;
    	      this.targetContainerName = defaults.targetContainerName;
    	      this.terminationMessagePath = defaults.terminationMessagePath;
    	      this.terminationMessagePolicy = defaults.terminationMessagePolicy;
    	      this.tty = defaults.tty;
    	      this.volumeDevices = defaults.volumeDevices;
    	      this.volumeMounts = defaults.volumeMounts;
    	      this.workingDir = defaults.workingDir;
        }

        public Builder args(@Nullable Output<List<String>> args) {
            this.args = args;
            return this;
        }

        public Builder args(@Nullable List<String> args) {
            this.args = Output.ofNullable(args);
            return this;
        }

        public Builder command(@Nullable Output<List<String>> command) {
            this.command = command;
            return this;
        }

        public Builder command(@Nullable List<String> command) {
            this.command = Output.ofNullable(command);
            return this;
        }

        public Builder env(@Nullable Output<List<EnvVarArgs>> env) {
            this.env = env;
            return this;
        }

        public Builder env(@Nullable List<EnvVarArgs> env) {
            this.env = Output.ofNullable(env);
            return this;
        }

        public Builder envFrom(@Nullable Output<List<EnvFromSourceArgs>> envFrom) {
            this.envFrom = envFrom;
            return this;
        }

        public Builder envFrom(@Nullable List<EnvFromSourceArgs> envFrom) {
            this.envFrom = Output.ofNullable(envFrom);
            return this;
        }

        public Builder image(@Nullable Output<String> image) {
            this.image = image;
            return this;
        }

        public Builder image(@Nullable String image) {
            this.image = Output.ofNullable(image);
            return this;
        }

        public Builder imagePullPolicy(@Nullable Output<String> imagePullPolicy) {
            this.imagePullPolicy = imagePullPolicy;
            return this;
        }

        public Builder imagePullPolicy(@Nullable String imagePullPolicy) {
            this.imagePullPolicy = Output.ofNullable(imagePullPolicy);
            return this;
        }

        public Builder lifecycle(@Nullable Output<LifecycleArgs> lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        public Builder lifecycle(@Nullable LifecycleArgs lifecycle) {
            this.lifecycle = Output.ofNullable(lifecycle);
            return this;
        }

        public Builder livenessProbe(@Nullable Output<ProbeArgs> livenessProbe) {
            this.livenessProbe = livenessProbe;
            return this;
        }

        public Builder livenessProbe(@Nullable ProbeArgs livenessProbe) {
            this.livenessProbe = Output.ofNullable(livenessProbe);
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder ports(@Nullable Output<List<ContainerPortArgs>> ports) {
            this.ports = ports;
            return this;
        }

        public Builder ports(@Nullable List<ContainerPortArgs> ports) {
            this.ports = Output.ofNullable(ports);
            return this;
        }

        public Builder readinessProbe(@Nullable Output<ProbeArgs> readinessProbe) {
            this.readinessProbe = readinessProbe;
            return this;
        }

        public Builder readinessProbe(@Nullable ProbeArgs readinessProbe) {
            this.readinessProbe = Output.ofNullable(readinessProbe);
            return this;
        }

        public Builder resources(@Nullable Output<ResourceRequirementsArgs> resources) {
            this.resources = resources;
            return this;
        }

        public Builder resources(@Nullable ResourceRequirementsArgs resources) {
            this.resources = Output.ofNullable(resources);
            return this;
        }

        public Builder securityContext(@Nullable Output<SecurityContextArgs> securityContext) {
            this.securityContext = securityContext;
            return this;
        }

        public Builder securityContext(@Nullable SecurityContextArgs securityContext) {
            this.securityContext = Output.ofNullable(securityContext);
            return this;
        }

        public Builder startupProbe(@Nullable Output<ProbeArgs> startupProbe) {
            this.startupProbe = startupProbe;
            return this;
        }

        public Builder startupProbe(@Nullable ProbeArgs startupProbe) {
            this.startupProbe = Output.ofNullable(startupProbe);
            return this;
        }

        public Builder stdin(@Nullable Output<Boolean> stdin) {
            this.stdin = stdin;
            return this;
        }

        public Builder stdin(@Nullable Boolean stdin) {
            this.stdin = Output.ofNullable(stdin);
            return this;
        }

        public Builder stdinOnce(@Nullable Output<Boolean> stdinOnce) {
            this.stdinOnce = stdinOnce;
            return this;
        }

        public Builder stdinOnce(@Nullable Boolean stdinOnce) {
            this.stdinOnce = Output.ofNullable(stdinOnce);
            return this;
        }

        public Builder targetContainerName(@Nullable Output<String> targetContainerName) {
            this.targetContainerName = targetContainerName;
            return this;
        }

        public Builder targetContainerName(@Nullable String targetContainerName) {
            this.targetContainerName = Output.ofNullable(targetContainerName);
            return this;
        }

        public Builder terminationMessagePath(@Nullable Output<String> terminationMessagePath) {
            this.terminationMessagePath = terminationMessagePath;
            return this;
        }

        public Builder terminationMessagePath(@Nullable String terminationMessagePath) {
            this.terminationMessagePath = Output.ofNullable(terminationMessagePath);
            return this;
        }

        public Builder terminationMessagePolicy(@Nullable Output<String> terminationMessagePolicy) {
            this.terminationMessagePolicy = terminationMessagePolicy;
            return this;
        }

        public Builder terminationMessagePolicy(@Nullable String terminationMessagePolicy) {
            this.terminationMessagePolicy = Output.ofNullable(terminationMessagePolicy);
            return this;
        }

        public Builder tty(@Nullable Output<Boolean> tty) {
            this.tty = tty;
            return this;
        }

        public Builder tty(@Nullable Boolean tty) {
            this.tty = Output.ofNullable(tty);
            return this;
        }

        public Builder volumeDevices(@Nullable Output<List<VolumeDeviceArgs>> volumeDevices) {
            this.volumeDevices = volumeDevices;
            return this;
        }

        public Builder volumeDevices(@Nullable List<VolumeDeviceArgs> volumeDevices) {
            this.volumeDevices = Output.ofNullable(volumeDevices);
            return this;
        }

        public Builder volumeMounts(@Nullable Output<List<VolumeMountArgs>> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }

        public Builder volumeMounts(@Nullable List<VolumeMountArgs> volumeMounts) {
            this.volumeMounts = Output.ofNullable(volumeMounts);
            return this;
        }

        public Builder workingDir(@Nullable Output<String> workingDir) {
            this.workingDir = workingDir;
            return this;
        }

        public Builder workingDir(@Nullable String workingDir) {
            this.workingDir = Output.ofNullable(workingDir);
            return this;
        }
        public EphemeralContainerArgs build() {
            return new EphemeralContainerArgs(args, command, env, envFrom, image, imagePullPolicy, lifecycle, livenessProbe, name, ports, readinessProbe, resources, securityContext, startupProbe, stdin, stdinOnce, targetContainerName, terminationMessagePath, terminationMessagePolicy, tty, volumeDevices, volumeMounts, workingDir);
        }
    }
}
