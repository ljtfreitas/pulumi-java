// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lightsail.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceState extends io.pulumi.resources.ResourceArgs {

    public static final InstanceState Empty = new InstanceState();

    /**
     * The ARN of the Lightsail instance (matches `id`).
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The Availability Zone in which to create your
     * instance (see list below)
     * 
     */
    @Import(name="availabilityZone")
      private final @Nullable Output<String> availabilityZone;

    public Output<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Output.empty() : this.availabilityZone;
    }

    /**
     * The ID for a virtual private server image. A list of available blueprint IDs can be obtained using the AWS CLI command: `aws lightsail get-blueprints`
     * 
     */
    @Import(name="blueprintId")
      private final @Nullable Output<String> blueprintId;

    public Output<String> getBlueprintId() {
        return this.blueprintId == null ? Output.empty() : this.blueprintId;
    }

    /**
     * The bundle of specification information (see list below)
     * 
     */
    @Import(name="bundleId")
      private final @Nullable Output<String> bundleId;

    public Output<String> getBundleId() {
        return this.bundleId == null ? Output.empty() : this.bundleId;
    }

    /**
     * The number of vCPUs the instance has.
     * 
     */
    @Import(name="cpuCount")
      private final @Nullable Output<Integer> cpuCount;

    public Output<Integer> getCpuCount() {
        return this.cpuCount == null ? Output.empty() : this.cpuCount;
    }

    /**
     * The timestamp when the instance was created.
     * 
     */
    @Import(name="createdAt")
      private final @Nullable Output<String> createdAt;

    public Output<String> getCreatedAt() {
        return this.createdAt == null ? Output.empty() : this.createdAt;
    }

    /**
     * (**Deprecated**) The first IPv6 address of the Lightsail instance. Use `ipv6_addresses` attribute instead.
     * 
     * @Deprecated
     * use `ipv6_addresses` attribute instead
     * 
     */
    @Deprecated /* use `ipv6_addresses` attribute instead */
    @Import(name="ipv6Address")
      private final @Nullable Output<String> ipv6Address;

    @Deprecated /* use `ipv6_addresses` attribute instead */
    public Output<String> getIpv6Address() {
        return this.ipv6Address == null ? Output.empty() : this.ipv6Address;
    }

    /**
     * List of IPv6 addresses for the Lightsail instance.
     * 
     */
    @Import(name="ipv6Addresses")
      private final @Nullable Output<List<String>> ipv6Addresses;

    public Output<List<String>> getIpv6Addresses() {
        return this.ipv6Addresses == null ? Output.empty() : this.ipv6Addresses;
    }

    /**
     * A Boolean value indicating whether this instance has a static IP assigned to it.
     * 
     */
    @Import(name="isStaticIp")
      private final @Nullable Output<Boolean> isStaticIp;

    public Output<Boolean> getIsStaticIp() {
        return this.isStaticIp == null ? Output.empty() : this.isStaticIp;
    }

    /**
     * The name of your key pair. Created in the
     * Lightsail console (cannot use `aws.ec2.KeyPair` at this time)
     * 
     */
    @Import(name="keyPairName")
      private final @Nullable Output<String> keyPairName;

    public Output<String> getKeyPairName() {
        return this.keyPairName == null ? Output.empty() : this.keyPairName;
    }

    /**
     * The name of the Lightsail Instance. Names be unique within each AWS Region in your Lightsail account.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The private IP address of the instance.
     * 
     */
    @Import(name="privateIpAddress")
      private final @Nullable Output<String> privateIpAddress;

    public Output<String> getPrivateIpAddress() {
        return this.privateIpAddress == null ? Output.empty() : this.privateIpAddress;
    }

    /**
     * The public IP address of the instance.
     * 
     */
    @Import(name="publicIpAddress")
      private final @Nullable Output<String> publicIpAddress;

    public Output<String> getPublicIpAddress() {
        return this.publicIpAddress == null ? Output.empty() : this.publicIpAddress;
    }

    /**
     * The amount of RAM in GB on the instance (e.g., 1.0).
     * 
     */
    @Import(name="ramSize")
      private final @Nullable Output<Double> ramSize;

    public Output<Double> getRamSize() {
        return this.ramSize == null ? Output.empty() : this.ramSize;
    }

    /**
     * A map of tags to assign to the resource. To create a key-only tag, use an empty string as the value. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * launch script to configure server with additional user data
     * 
     */
    @Import(name="userData")
      private final @Nullable Output<String> userData;

    public Output<String> getUserData() {
        return this.userData == null ? Output.empty() : this.userData;
    }

    /**
     * The user name for connecting to the instance (e.g., ec2-user).
     * 
     */
    @Import(name="username")
      private final @Nullable Output<String> username;

    public Output<String> getUsername() {
        return this.username == null ? Output.empty() : this.username;
    }

    public InstanceState(
        @Nullable Output<String> arn,
        @Nullable Output<String> availabilityZone,
        @Nullable Output<String> blueprintId,
        @Nullable Output<String> bundleId,
        @Nullable Output<Integer> cpuCount,
        @Nullable Output<String> createdAt,
        @Nullable Output<String> ipv6Address,
        @Nullable Output<List<String>> ipv6Addresses,
        @Nullable Output<Boolean> isStaticIp,
        @Nullable Output<String> keyPairName,
        @Nullable Output<String> name,
        @Nullable Output<String> privateIpAddress,
        @Nullable Output<String> publicIpAddress,
        @Nullable Output<Double> ramSize,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> userData,
        @Nullable Output<String> username) {
        this.arn = arn;
        this.availabilityZone = availabilityZone;
        this.blueprintId = blueprintId;
        this.bundleId = bundleId;
        this.cpuCount = cpuCount;
        this.createdAt = createdAt;
        this.ipv6Address = ipv6Address;
        this.ipv6Addresses = ipv6Addresses;
        this.isStaticIp = isStaticIp;
        this.keyPairName = keyPairName;
        this.name = name;
        this.privateIpAddress = privateIpAddress;
        this.publicIpAddress = publicIpAddress;
        this.ramSize = ramSize;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.userData = userData;
        this.username = username;
    }

    private InstanceState() {
        this.arn = Output.empty();
        this.availabilityZone = Output.empty();
        this.blueprintId = Output.empty();
        this.bundleId = Output.empty();
        this.cpuCount = Output.empty();
        this.createdAt = Output.empty();
        this.ipv6Address = Output.empty();
        this.ipv6Addresses = Output.empty();
        this.isStaticIp = Output.empty();
        this.keyPairName = Output.empty();
        this.name = Output.empty();
        this.privateIpAddress = Output.empty();
        this.publicIpAddress = Output.empty();
        this.ramSize = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.userData = Output.empty();
        this.username = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> availabilityZone;
        private @Nullable Output<String> blueprintId;
        private @Nullable Output<String> bundleId;
        private @Nullable Output<Integer> cpuCount;
        private @Nullable Output<String> createdAt;
        private @Nullable Output<String> ipv6Address;
        private @Nullable Output<List<String>> ipv6Addresses;
        private @Nullable Output<Boolean> isStaticIp;
        private @Nullable Output<String> keyPairName;
        private @Nullable Output<String> name;
        private @Nullable Output<String> privateIpAddress;
        private @Nullable Output<String> publicIpAddress;
        private @Nullable Output<Double> ramSize;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> userData;
        private @Nullable Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.blueprintId = defaults.blueprintId;
    	      this.bundleId = defaults.bundleId;
    	      this.cpuCount = defaults.cpuCount;
    	      this.createdAt = defaults.createdAt;
    	      this.ipv6Address = defaults.ipv6Address;
    	      this.ipv6Addresses = defaults.ipv6Addresses;
    	      this.isStaticIp = defaults.isStaticIp;
    	      this.keyPairName = defaults.keyPairName;
    	      this.name = defaults.name;
    	      this.privateIpAddress = defaults.privateIpAddress;
    	      this.publicIpAddress = defaults.publicIpAddress;
    	      this.ramSize = defaults.ramSize;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.userData = defaults.userData;
    	      this.username = defaults.username;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Output.ofNullable(availabilityZone);
            return this;
        }

        public Builder blueprintId(@Nullable Output<String> blueprintId) {
            this.blueprintId = blueprintId;
            return this;
        }

        public Builder blueprintId(@Nullable String blueprintId) {
            this.blueprintId = Output.ofNullable(blueprintId);
            return this;
        }

        public Builder bundleId(@Nullable Output<String> bundleId) {
            this.bundleId = bundleId;
            return this;
        }

        public Builder bundleId(@Nullable String bundleId) {
            this.bundleId = Output.ofNullable(bundleId);
            return this;
        }

        public Builder cpuCount(@Nullable Output<Integer> cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }

        public Builder cpuCount(@Nullable Integer cpuCount) {
            this.cpuCount = Output.ofNullable(cpuCount);
            return this;
        }

        public Builder createdAt(@Nullable Output<String> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder createdAt(@Nullable String createdAt) {
            this.createdAt = Output.ofNullable(createdAt);
            return this;
        }

        public Builder ipv6Address(@Nullable Output<String> ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }

        public Builder ipv6Address(@Nullable String ipv6Address) {
            this.ipv6Address = Output.ofNullable(ipv6Address);
            return this;
        }

        public Builder ipv6Addresses(@Nullable Output<List<String>> ipv6Addresses) {
            this.ipv6Addresses = ipv6Addresses;
            return this;
        }

        public Builder ipv6Addresses(@Nullable List<String> ipv6Addresses) {
            this.ipv6Addresses = Output.ofNullable(ipv6Addresses);
            return this;
        }

        public Builder isStaticIp(@Nullable Output<Boolean> isStaticIp) {
            this.isStaticIp = isStaticIp;
            return this;
        }

        public Builder isStaticIp(@Nullable Boolean isStaticIp) {
            this.isStaticIp = Output.ofNullable(isStaticIp);
            return this;
        }

        public Builder keyPairName(@Nullable Output<String> keyPairName) {
            this.keyPairName = keyPairName;
            return this;
        }

        public Builder keyPairName(@Nullable String keyPairName) {
            this.keyPairName = Output.ofNullable(keyPairName);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder privateIpAddress(@Nullable Output<String> privateIpAddress) {
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        public Builder privateIpAddress(@Nullable String privateIpAddress) {
            this.privateIpAddress = Output.ofNullable(privateIpAddress);
            return this;
        }

        public Builder publicIpAddress(@Nullable Output<String> publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }

        public Builder publicIpAddress(@Nullable String publicIpAddress) {
            this.publicIpAddress = Output.ofNullable(publicIpAddress);
            return this;
        }

        public Builder ramSize(@Nullable Output<Double> ramSize) {
            this.ramSize = ramSize;
            return this;
        }

        public Builder ramSize(@Nullable Double ramSize) {
            this.ramSize = Output.ofNullable(ramSize);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }

        public Builder userData(@Nullable Output<String> userData) {
            this.userData = userData;
            return this;
        }

        public Builder userData(@Nullable String userData) {
            this.userData = Output.ofNullable(userData);
            return this;
        }

        public Builder username(@Nullable Output<String> username) {
            this.username = username;
            return this;
        }

        public Builder username(@Nullable String username) {
            this.username = Output.ofNullable(username);
            return this;
        }
        public InstanceState build() {
            return new InstanceState(arn, availabilityZone, blueprintId, bundleId, cpuCount, createdAt, ipv6Address, ipv6Addresses, isStaticIp, keyPairName, name, privateIpAddress, publicIpAddress, ramSize, tags, tagsAll, userData, username);
        }
    }
}
