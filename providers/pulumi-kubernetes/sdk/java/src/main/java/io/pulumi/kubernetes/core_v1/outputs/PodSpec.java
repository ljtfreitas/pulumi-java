// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.Affinity;
import io.pulumi.kubernetes.core_v1.outputs.Container;
import io.pulumi.kubernetes.core_v1.outputs.EphemeralContainer;
import io.pulumi.kubernetes.core_v1.outputs.HostAlias;
import io.pulumi.kubernetes.core_v1.outputs.LocalObjectReference;
import io.pulumi.kubernetes.core_v1.outputs.PodDNSConfig;
import io.pulumi.kubernetes.core_v1.outputs.PodOS;
import io.pulumi.kubernetes.core_v1.outputs.PodReadinessGate;
import io.pulumi.kubernetes.core_v1.outputs.PodSecurityContext;
import io.pulumi.kubernetes.core_v1.outputs.Toleration;
import io.pulumi.kubernetes.core_v1.outputs.TopologySpreadConstraint;
import io.pulumi.kubernetes.core_v1.outputs.Volume;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PodSpec {
    private final @Nullable Integer activeDeadlineSeconds;
    private final @Nullable Affinity affinity;
    private final @Nullable Boolean automountServiceAccountToken;
    private final List<Container> containers;
    private final @Nullable PodDNSConfig dnsConfig;
    private final @Nullable String dnsPolicy;
    private final @Nullable Boolean enableServiceLinks;
    private final @Nullable List<EphemeralContainer> ephemeralContainers;
    private final @Nullable List<HostAlias> hostAliases;
    private final @Nullable Boolean hostIPC;
    private final @Nullable Boolean hostNetwork;
    private final @Nullable Boolean hostPID;
    private final @Nullable String hostname;
    private final @Nullable List<LocalObjectReference> imagePullSecrets;
    private final @Nullable List<Container> initContainers;
    private final @Nullable String nodeName;
    private final @Nullable Map<String,String> nodeSelector;
    private final @Nullable PodOS os;
    private final @Nullable Map<String,String> overhead;
    private final @Nullable String preemptionPolicy;
    private final @Nullable Integer priority;
    private final @Nullable String priorityClassName;
    private final @Nullable List<PodReadinessGate> readinessGates;
    private final @Nullable String restartPolicy;
    private final @Nullable String runtimeClassName;
    private final @Nullable String schedulerName;
    private final @Nullable PodSecurityContext securityContext;
    private final @Nullable String serviceAccount;
    private final @Nullable String serviceAccountName;
    private final @Nullable Boolean setHostnameAsFQDN;
    private final @Nullable Boolean shareProcessNamespace;
    private final @Nullable String subdomain;
    private final @Nullable Integer terminationGracePeriodSeconds;
    private final @Nullable List<Toleration> tolerations;
    private final @Nullable List<TopologySpreadConstraint> topologySpreadConstraints;
    private final @Nullable List<Volume> volumes;

    @OutputCustomType.Constructor({"activeDeadlineSeconds","affinity","automountServiceAccountToken","containers","dnsConfig","dnsPolicy","enableServiceLinks","ephemeralContainers","hostAliases","hostIPC","hostNetwork","hostPID","hostname","imagePullSecrets","initContainers","nodeName","nodeSelector","os","overhead","preemptionPolicy","priority","priorityClassName","readinessGates","restartPolicy","runtimeClassName","schedulerName","securityContext","serviceAccount","serviceAccountName","setHostnameAsFQDN","shareProcessNamespace","subdomain","terminationGracePeriodSeconds","tolerations","topologySpreadConstraints","volumes"})
    private PodSpec(
        @Nullable Integer activeDeadlineSeconds,
        @Nullable Affinity affinity,
        @Nullable Boolean automountServiceAccountToken,
        List<Container> containers,
        @Nullable PodDNSConfig dnsConfig,
        @Nullable String dnsPolicy,
        @Nullable Boolean enableServiceLinks,
        @Nullable List<EphemeralContainer> ephemeralContainers,
        @Nullable List<HostAlias> hostAliases,
        @Nullable Boolean hostIPC,
        @Nullable Boolean hostNetwork,
        @Nullable Boolean hostPID,
        @Nullable String hostname,
        @Nullable List<LocalObjectReference> imagePullSecrets,
        @Nullable List<Container> initContainers,
        @Nullable String nodeName,
        @Nullable Map<String,String> nodeSelector,
        @Nullable PodOS os,
        @Nullable Map<String,String> overhead,
        @Nullable String preemptionPolicy,
        @Nullable Integer priority,
        @Nullable String priorityClassName,
        @Nullable List<PodReadinessGate> readinessGates,
        @Nullable String restartPolicy,
        @Nullable String runtimeClassName,
        @Nullable String schedulerName,
        @Nullable PodSecurityContext securityContext,
        @Nullable String serviceAccount,
        @Nullable String serviceAccountName,
        @Nullable Boolean setHostnameAsFQDN,
        @Nullable Boolean shareProcessNamespace,
        @Nullable String subdomain,
        @Nullable Integer terminationGracePeriodSeconds,
        @Nullable List<Toleration> tolerations,
        @Nullable List<TopologySpreadConstraint> topologySpreadConstraints,
        @Nullable List<Volume> volumes) {
        this.activeDeadlineSeconds = activeDeadlineSeconds;
        this.affinity = affinity;
        this.automountServiceAccountToken = automountServiceAccountToken;
        this.containers = Objects.requireNonNull(containers);
        this.dnsConfig = dnsConfig;
        this.dnsPolicy = dnsPolicy;
        this.enableServiceLinks = enableServiceLinks;
        this.ephemeralContainers = ephemeralContainers;
        this.hostAliases = hostAliases;
        this.hostIPC = hostIPC;
        this.hostNetwork = hostNetwork;
        this.hostPID = hostPID;
        this.hostname = hostname;
        this.imagePullSecrets = imagePullSecrets;
        this.initContainers = initContainers;
        this.nodeName = nodeName;
        this.nodeSelector = nodeSelector;
        this.os = os;
        this.overhead = overhead;
        this.preemptionPolicy = preemptionPolicy;
        this.priority = priority;
        this.priorityClassName = priorityClassName;
        this.readinessGates = readinessGates;
        this.restartPolicy = restartPolicy;
        this.runtimeClassName = runtimeClassName;
        this.schedulerName = schedulerName;
        this.securityContext = securityContext;
        this.serviceAccount = serviceAccount;
        this.serviceAccountName = serviceAccountName;
        this.setHostnameAsFQDN = setHostnameAsFQDN;
        this.shareProcessNamespace = shareProcessNamespace;
        this.subdomain = subdomain;
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        this.tolerations = tolerations;
        this.topologySpreadConstraints = topologySpreadConstraints;
        this.volumes = volumes;
    }

    public Optional<Integer> getActiveDeadlineSeconds() {
        return Optional.ofNullable(this.activeDeadlineSeconds);
    }
    public Optional<Affinity> getAffinity() {
        return Optional.ofNullable(this.affinity);
    }
    public Optional<Boolean> getAutomountServiceAccountToken() {
        return Optional.ofNullable(this.automountServiceAccountToken);
    }
    public List<Container> getContainers() {
        return this.containers;
    }
    public Optional<PodDNSConfig> getDnsConfig() {
        return Optional.ofNullable(this.dnsConfig);
    }
    public Optional<String> getDnsPolicy() {
        return Optional.ofNullable(this.dnsPolicy);
    }
    public Optional<Boolean> getEnableServiceLinks() {
        return Optional.ofNullable(this.enableServiceLinks);
    }
    public List<EphemeralContainer> getEphemeralContainers() {
        return this.ephemeralContainers == null ? List.of() : this.ephemeralContainers;
    }
    public List<HostAlias> getHostAliases() {
        return this.hostAliases == null ? List.of() : this.hostAliases;
    }
    public Optional<Boolean> getHostIPC() {
        return Optional.ofNullable(this.hostIPC);
    }
    public Optional<Boolean> getHostNetwork() {
        return Optional.ofNullable(this.hostNetwork);
    }
    public Optional<Boolean> getHostPID() {
        return Optional.ofNullable(this.hostPID);
    }
    public Optional<String> getHostname() {
        return Optional.ofNullable(this.hostname);
    }
    public List<LocalObjectReference> getImagePullSecrets() {
        return this.imagePullSecrets == null ? List.of() : this.imagePullSecrets;
    }
    public List<Container> getInitContainers() {
        return this.initContainers == null ? List.of() : this.initContainers;
    }
    public Optional<String> getNodeName() {
        return Optional.ofNullable(this.nodeName);
    }
    public Map<String,String> getNodeSelector() {
        return this.nodeSelector == null ? Map.of() : this.nodeSelector;
    }
    public Optional<PodOS> getOs() {
        return Optional.ofNullable(this.os);
    }
    public Map<String,String> getOverhead() {
        return this.overhead == null ? Map.of() : this.overhead;
    }
    public Optional<String> getPreemptionPolicy() {
        return Optional.ofNullable(this.preemptionPolicy);
    }
    public Optional<Integer> getPriority() {
        return Optional.ofNullable(this.priority);
    }
    public Optional<String> getPriorityClassName() {
        return Optional.ofNullable(this.priorityClassName);
    }
    public List<PodReadinessGate> getReadinessGates() {
        return this.readinessGates == null ? List.of() : this.readinessGates;
    }
    public Optional<String> getRestartPolicy() {
        return Optional.ofNullable(this.restartPolicy);
    }
    public Optional<String> getRuntimeClassName() {
        return Optional.ofNullable(this.runtimeClassName);
    }
    public Optional<String> getSchedulerName() {
        return Optional.ofNullable(this.schedulerName);
    }
    public Optional<PodSecurityContext> getSecurityContext() {
        return Optional.ofNullable(this.securityContext);
    }
    public Optional<String> getServiceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }
    public Optional<String> getServiceAccountName() {
        return Optional.ofNullable(this.serviceAccountName);
    }
    public Optional<Boolean> getSetHostnameAsFQDN() {
        return Optional.ofNullable(this.setHostnameAsFQDN);
    }
    public Optional<Boolean> getShareProcessNamespace() {
        return Optional.ofNullable(this.shareProcessNamespace);
    }
    public Optional<String> getSubdomain() {
        return Optional.ofNullable(this.subdomain);
    }
    public Optional<Integer> getTerminationGracePeriodSeconds() {
        return Optional.ofNullable(this.terminationGracePeriodSeconds);
    }
    public List<Toleration> getTolerations() {
        return this.tolerations == null ? List.of() : this.tolerations;
    }
    public List<TopologySpreadConstraint> getTopologySpreadConstraints() {
        return this.topologySpreadConstraints == null ? List.of() : this.topologySpreadConstraints;
    }
    public List<Volume> getVolumes() {
        return this.volumes == null ? List.of() : this.volumes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer activeDeadlineSeconds;
        private @Nullable Affinity affinity;
        private @Nullable Boolean automountServiceAccountToken;
        private List<Container> containers;
        private @Nullable PodDNSConfig dnsConfig;
        private @Nullable String dnsPolicy;
        private @Nullable Boolean enableServiceLinks;
        private @Nullable List<EphemeralContainer> ephemeralContainers;
        private @Nullable List<HostAlias> hostAliases;
        private @Nullable Boolean hostIPC;
        private @Nullable Boolean hostNetwork;
        private @Nullable Boolean hostPID;
        private @Nullable String hostname;
        private @Nullable List<LocalObjectReference> imagePullSecrets;
        private @Nullable List<Container> initContainers;
        private @Nullable String nodeName;
        private @Nullable Map<String,String> nodeSelector;
        private @Nullable PodOS os;
        private @Nullable Map<String,String> overhead;
        private @Nullable String preemptionPolicy;
        private @Nullable Integer priority;
        private @Nullable String priorityClassName;
        private @Nullable List<PodReadinessGate> readinessGates;
        private @Nullable String restartPolicy;
        private @Nullable String runtimeClassName;
        private @Nullable String schedulerName;
        private @Nullable PodSecurityContext securityContext;
        private @Nullable String serviceAccount;
        private @Nullable String serviceAccountName;
        private @Nullable Boolean setHostnameAsFQDN;
        private @Nullable Boolean shareProcessNamespace;
        private @Nullable String subdomain;
        private @Nullable Integer terminationGracePeriodSeconds;
        private @Nullable List<Toleration> tolerations;
        private @Nullable List<TopologySpreadConstraint> topologySpreadConstraints;
        private @Nullable List<Volume> volumes;

        public Builder() {
    	      // Empty
        }

        public Builder(PodSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDeadlineSeconds = defaults.activeDeadlineSeconds;
    	      this.affinity = defaults.affinity;
    	      this.automountServiceAccountToken = defaults.automountServiceAccountToken;
    	      this.containers = defaults.containers;
    	      this.dnsConfig = defaults.dnsConfig;
    	      this.dnsPolicy = defaults.dnsPolicy;
    	      this.enableServiceLinks = defaults.enableServiceLinks;
    	      this.ephemeralContainers = defaults.ephemeralContainers;
    	      this.hostAliases = defaults.hostAliases;
    	      this.hostIPC = defaults.hostIPC;
    	      this.hostNetwork = defaults.hostNetwork;
    	      this.hostPID = defaults.hostPID;
    	      this.hostname = defaults.hostname;
    	      this.imagePullSecrets = defaults.imagePullSecrets;
    	      this.initContainers = defaults.initContainers;
    	      this.nodeName = defaults.nodeName;
    	      this.nodeSelector = defaults.nodeSelector;
    	      this.os = defaults.os;
    	      this.overhead = defaults.overhead;
    	      this.preemptionPolicy = defaults.preemptionPolicy;
    	      this.priority = defaults.priority;
    	      this.priorityClassName = defaults.priorityClassName;
    	      this.readinessGates = defaults.readinessGates;
    	      this.restartPolicy = defaults.restartPolicy;
    	      this.runtimeClassName = defaults.runtimeClassName;
    	      this.schedulerName = defaults.schedulerName;
    	      this.securityContext = defaults.securityContext;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.serviceAccountName = defaults.serviceAccountName;
    	      this.setHostnameAsFQDN = defaults.setHostnameAsFQDN;
    	      this.shareProcessNamespace = defaults.shareProcessNamespace;
    	      this.subdomain = defaults.subdomain;
    	      this.terminationGracePeriodSeconds = defaults.terminationGracePeriodSeconds;
    	      this.tolerations = defaults.tolerations;
    	      this.topologySpreadConstraints = defaults.topologySpreadConstraints;
    	      this.volumes = defaults.volumes;
        }

        public Builder setActiveDeadlineSeconds(@Nullable Integer activeDeadlineSeconds) {
            this.activeDeadlineSeconds = activeDeadlineSeconds;
            return this;
        }

        public Builder setAffinity(@Nullable Affinity affinity) {
            this.affinity = affinity;
            return this;
        }

        public Builder setAutomountServiceAccountToken(@Nullable Boolean automountServiceAccountToken) {
            this.automountServiceAccountToken = automountServiceAccountToken;
            return this;
        }

        public Builder setContainers(List<Container> containers) {
            this.containers = Objects.requireNonNull(containers);
            return this;
        }

        public Builder setDnsConfig(@Nullable PodDNSConfig dnsConfig) {
            this.dnsConfig = dnsConfig;
            return this;
        }

        public Builder setDnsPolicy(@Nullable String dnsPolicy) {
            this.dnsPolicy = dnsPolicy;
            return this;
        }

        public Builder setEnableServiceLinks(@Nullable Boolean enableServiceLinks) {
            this.enableServiceLinks = enableServiceLinks;
            return this;
        }

        public Builder setEphemeralContainers(@Nullable List<EphemeralContainer> ephemeralContainers) {
            this.ephemeralContainers = ephemeralContainers;
            return this;
        }

        public Builder setHostAliases(@Nullable List<HostAlias> hostAliases) {
            this.hostAliases = hostAliases;
            return this;
        }

        public Builder setHostIPC(@Nullable Boolean hostIPC) {
            this.hostIPC = hostIPC;
            return this;
        }

        public Builder setHostNetwork(@Nullable Boolean hostNetwork) {
            this.hostNetwork = hostNetwork;
            return this;
        }

        public Builder setHostPID(@Nullable Boolean hostPID) {
            this.hostPID = hostPID;
            return this;
        }

        public Builder setHostname(@Nullable String hostname) {
            this.hostname = hostname;
            return this;
        }

        public Builder setImagePullSecrets(@Nullable List<LocalObjectReference> imagePullSecrets) {
            this.imagePullSecrets = imagePullSecrets;
            return this;
        }

        public Builder setInitContainers(@Nullable List<Container> initContainers) {
            this.initContainers = initContainers;
            return this;
        }

        public Builder setNodeName(@Nullable String nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        public Builder setNodeSelector(@Nullable Map<String,String> nodeSelector) {
            this.nodeSelector = nodeSelector;
            return this;
        }

        public Builder setOs(@Nullable PodOS os) {
            this.os = os;
            return this;
        }

        public Builder setOverhead(@Nullable Map<String,String> overhead) {
            this.overhead = overhead;
            return this;
        }

        public Builder setPreemptionPolicy(@Nullable String preemptionPolicy) {
            this.preemptionPolicy = preemptionPolicy;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPriorityClassName(@Nullable String priorityClassName) {
            this.priorityClassName = priorityClassName;
            return this;
        }

        public Builder setReadinessGates(@Nullable List<PodReadinessGate> readinessGates) {
            this.readinessGates = readinessGates;
            return this;
        }

        public Builder setRestartPolicy(@Nullable String restartPolicy) {
            this.restartPolicy = restartPolicy;
            return this;
        }

        public Builder setRuntimeClassName(@Nullable String runtimeClassName) {
            this.runtimeClassName = runtimeClassName;
            return this;
        }

        public Builder setSchedulerName(@Nullable String schedulerName) {
            this.schedulerName = schedulerName;
            return this;
        }

        public Builder setSecurityContext(@Nullable PodSecurityContext securityContext) {
            this.securityContext = securityContext;
            return this;
        }

        public Builder setServiceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder setServiceAccountName(@Nullable String serviceAccountName) {
            this.serviceAccountName = serviceAccountName;
            return this;
        }

        public Builder setSetHostnameAsFQDN(@Nullable Boolean setHostnameAsFQDN) {
            this.setHostnameAsFQDN = setHostnameAsFQDN;
            return this;
        }

        public Builder setShareProcessNamespace(@Nullable Boolean shareProcessNamespace) {
            this.shareProcessNamespace = shareProcessNamespace;
            return this;
        }

        public Builder setSubdomain(@Nullable String subdomain) {
            this.subdomain = subdomain;
            return this;
        }

        public Builder setTerminationGracePeriodSeconds(@Nullable Integer terminationGracePeriodSeconds) {
            this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
            return this;
        }

        public Builder setTolerations(@Nullable List<Toleration> tolerations) {
            this.tolerations = tolerations;
            return this;
        }

        public Builder setTopologySpreadConstraints(@Nullable List<TopologySpreadConstraint> topologySpreadConstraints) {
            this.topologySpreadConstraints = topologySpreadConstraints;
            return this;
        }

        public Builder setVolumes(@Nullable List<Volume> volumes) {
            this.volumes = volumes;
            return this;
        }

        public PodSpec build() {
            return new PodSpec(activeDeadlineSeconds, affinity, automountServiceAccountToken, containers, dnsConfig, dnsPolicy, enableServiceLinks, ephemeralContainers, hostAliases, hostIPC, hostNetwork, hostPID, hostname, imagePullSecrets, initContainers, nodeName, nodeSelector, os, overhead, preemptionPolicy, priority, priorityClassName, readinessGates, restartPolicy, runtimeClassName, schedulerName, securityContext, serviceAccount, serviceAccountName, setHostnameAsFQDN, shareProcessNamespace, subdomain, terminationGracePeriodSeconds, tolerations, topologySpreadConstraints, volumes);
        }
    }
}