// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NodeSystemInfo {
    /**
     * The Architecture reported by the node
     * 
     */
    private final String architecture;
    /**
     * Boot ID reported by the node.
     * 
     */
    private final String bootID;
    /**
     * ContainerRuntime Version reported by the node through runtime remote API (e.g. docker://1.5.0).
     * 
     */
    private final String containerRuntimeVersion;
    /**
     * Kernel Version reported by the node from 'uname -r' (e.g. 3.16.0-0.bpo.4-amd64).
     * 
     */
    private final String kernelVersion;
    /**
     * KubeProxy Version reported by the node.
     * 
     */
    private final String kubeProxyVersion;
    /**
     * Kubelet Version reported by the node.
     * 
     */
    private final String kubeletVersion;
    /**
     * MachineID reported by the node. For unique machine identification in the cluster this field is preferred. Learn more from man(5) machine-id: http://man7.org/linux/man-pages/man5/machine-id.5.html
     * 
     */
    private final String machineID;
    /**
     * The Operating System reported by the node
     * 
     */
    private final String operatingSystem;
    /**
     * OS Image reported by the node from /etc/os-release (e.g. Debian GNU/Linux 7 (wheezy)).
     * 
     */
    private final String osImage;
    /**
     * SystemUUID reported by the node. For unique machine identification MachineID is preferred. This field is specific to Red Hat hosts https://access.redhat.com/documentation/en-us/red_hat_subscription_management/1/html/rhsm/uuid
     * 
     */
    private final String systemUUID;

    @OutputCustomType.Constructor({"architecture","bootID","containerRuntimeVersion","kernelVersion","kubeProxyVersion","kubeletVersion","machineID","operatingSystem","osImage","systemUUID"})
    private NodeSystemInfo(
        String architecture,
        String bootID,
        String containerRuntimeVersion,
        String kernelVersion,
        String kubeProxyVersion,
        String kubeletVersion,
        String machineID,
        String operatingSystem,
        String osImage,
        String systemUUID) {
        this.architecture = Objects.requireNonNull(architecture);
        this.bootID = Objects.requireNonNull(bootID);
        this.containerRuntimeVersion = Objects.requireNonNull(containerRuntimeVersion);
        this.kernelVersion = Objects.requireNonNull(kernelVersion);
        this.kubeProxyVersion = Objects.requireNonNull(kubeProxyVersion);
        this.kubeletVersion = Objects.requireNonNull(kubeletVersion);
        this.machineID = Objects.requireNonNull(machineID);
        this.operatingSystem = Objects.requireNonNull(operatingSystem);
        this.osImage = Objects.requireNonNull(osImage);
        this.systemUUID = Objects.requireNonNull(systemUUID);
    }

    /**
     * The Architecture reported by the node
     * 
     */
    public String getArchitecture() {
        return this.architecture;
    }
    /**
     * Boot ID reported by the node.
     * 
     */
    public String getBootID() {
        return this.bootID;
    }
    /**
     * ContainerRuntime Version reported by the node through runtime remote API (e.g. docker://1.5.0).
     * 
     */
    public String getContainerRuntimeVersion() {
        return this.containerRuntimeVersion;
    }
    /**
     * Kernel Version reported by the node from 'uname -r' (e.g. 3.16.0-0.bpo.4-amd64).
     * 
     */
    public String getKernelVersion() {
        return this.kernelVersion;
    }
    /**
     * KubeProxy Version reported by the node.
     * 
     */
    public String getKubeProxyVersion() {
        return this.kubeProxyVersion;
    }
    /**
     * Kubelet Version reported by the node.
     * 
     */
    public String getKubeletVersion() {
        return this.kubeletVersion;
    }
    /**
     * MachineID reported by the node. For unique machine identification in the cluster this field is preferred. Learn more from man(5) machine-id: http://man7.org/linux/man-pages/man5/machine-id.5.html
     * 
     */
    public String getMachineID() {
        return this.machineID;
    }
    /**
     * The Operating System reported by the node
     * 
     */
    public String getOperatingSystem() {
        return this.operatingSystem;
    }
    /**
     * OS Image reported by the node from /etc/os-release (e.g. Debian GNU/Linux 7 (wheezy)).
     * 
     */
    public String getOsImage() {
        return this.osImage;
    }
    /**
     * SystemUUID reported by the node. For unique machine identification MachineID is preferred. This field is specific to Red Hat hosts https://access.redhat.com/documentation/en-us/red_hat_subscription_management/1/html/rhsm/uuid
     * 
     */
    public String getSystemUUID() {
        return this.systemUUID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeSystemInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String architecture;
        private String bootID;
        private String containerRuntimeVersion;
        private String kernelVersion;
        private String kubeProxyVersion;
        private String kubeletVersion;
        private String machineID;
        private String operatingSystem;
        private String osImage;
        private String systemUUID;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeSystemInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.architecture = defaults.architecture;
    	      this.bootID = defaults.bootID;
    	      this.containerRuntimeVersion = defaults.containerRuntimeVersion;
    	      this.kernelVersion = defaults.kernelVersion;
    	      this.kubeProxyVersion = defaults.kubeProxyVersion;
    	      this.kubeletVersion = defaults.kubeletVersion;
    	      this.machineID = defaults.machineID;
    	      this.operatingSystem = defaults.operatingSystem;
    	      this.osImage = defaults.osImage;
    	      this.systemUUID = defaults.systemUUID;
        }

        public Builder setArchitecture(String architecture) {
            this.architecture = Objects.requireNonNull(architecture);
            return this;
        }

        public Builder setBootID(String bootID) {
            this.bootID = Objects.requireNonNull(bootID);
            return this;
        }

        public Builder setContainerRuntimeVersion(String containerRuntimeVersion) {
            this.containerRuntimeVersion = Objects.requireNonNull(containerRuntimeVersion);
            return this;
        }

        public Builder setKernelVersion(String kernelVersion) {
            this.kernelVersion = Objects.requireNonNull(kernelVersion);
            return this;
        }

        public Builder setKubeProxyVersion(String kubeProxyVersion) {
            this.kubeProxyVersion = Objects.requireNonNull(kubeProxyVersion);
            return this;
        }

        public Builder setKubeletVersion(String kubeletVersion) {
            this.kubeletVersion = Objects.requireNonNull(kubeletVersion);
            return this;
        }

        public Builder setMachineID(String machineID) {
            this.machineID = Objects.requireNonNull(machineID);
            return this;
        }

        public Builder setOperatingSystem(String operatingSystem) {
            this.operatingSystem = Objects.requireNonNull(operatingSystem);
            return this;
        }

        public Builder setOsImage(String osImage) {
            this.osImage = Objects.requireNonNull(osImage);
            return this;
        }

        public Builder setSystemUUID(String systemUUID) {
            this.systemUUID = Objects.requireNonNull(systemUUID);
            return this;
        }
        public NodeSystemInfo build() {
            return new NodeSystemInfo(architecture, bootID, containerRuntimeVersion, kernelVersion, kubeProxyVersion, kubeletVersion, machineID, operatingSystem, osImage, systemUUID);
        }
    }
}
