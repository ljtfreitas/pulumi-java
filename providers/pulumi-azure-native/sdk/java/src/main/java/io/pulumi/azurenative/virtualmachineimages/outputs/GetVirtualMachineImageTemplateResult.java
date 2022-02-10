// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages.outputs;

import io.pulumi.azurenative.virtualmachineimages.outputs.ImageTemplateFileCustomizerResponse;
import io.pulumi.azurenative.virtualmachineimages.outputs.ImageTemplateIdentityResponse;
import io.pulumi.azurenative.virtualmachineimages.outputs.ImageTemplateLastRunStatusResponse;
import io.pulumi.azurenative.virtualmachineimages.outputs.ImageTemplateManagedImageDistributorResponse;
import io.pulumi.azurenative.virtualmachineimages.outputs.ImageTemplateManagedImageSourceResponse;
import io.pulumi.azurenative.virtualmachineimages.outputs.ImageTemplatePlatformImageSourceResponse;
import io.pulumi.azurenative.virtualmachineimages.outputs.ImageTemplatePowerShellCustomizerResponse;
import io.pulumi.azurenative.virtualmachineimages.outputs.ImageTemplateRestartCustomizerResponse;
import io.pulumi.azurenative.virtualmachineimages.outputs.ImageTemplateSharedImageDistributorResponse;
import io.pulumi.azurenative.virtualmachineimages.outputs.ImageTemplateSharedImageVersionSourceResponse;
import io.pulumi.azurenative.virtualmachineimages.outputs.ImageTemplateShellCustomizerResponse;
import io.pulumi.azurenative.virtualmachineimages.outputs.ImageTemplateVhdDistributorResponse;
import io.pulumi.azurenative.virtualmachineimages.outputs.ImageTemplateVmProfileResponse;
import io.pulumi.azurenative.virtualmachineimages.outputs.ImageTemplateWindowsUpdateCustomizerResponse;
import io.pulumi.azurenative.virtualmachineimages.outputs.ProvisioningErrorResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetVirtualMachineImageTemplateResult {
    private final @Nullable Integer buildTimeoutInMinutes;
    private final @Nullable List<Object> customize;
    private final List<Object> distribute;
    private final String id;
    private final ImageTemplateIdentityResponse identity;
    private final ImageTemplateLastRunStatusResponse lastRunStatus;
    private final String location;
    private final String name;
    private final ProvisioningErrorResponse provisioningError;
    private final String provisioningState;
    private final Object source;
    private final @Nullable Map<String,String> tags;
    private final String type;
    private final @Nullable ImageTemplateVmProfileResponse vmProfile;

    @OutputCustomType.Constructor({"buildTimeoutInMinutes","customize","distribute","id","identity","lastRunStatus","location","name","provisioningError","provisioningState","source","tags","type","vmProfile"})
    private GetVirtualMachineImageTemplateResult(
        @Nullable Integer buildTimeoutInMinutes,
        @Nullable List<Object> customize,
        List<Object> distribute,
        String id,
        ImageTemplateIdentityResponse identity,
        ImageTemplateLastRunStatusResponse lastRunStatus,
        String location,
        String name,
        ProvisioningErrorResponse provisioningError,
        String provisioningState,
        Object source,
        @Nullable Map<String,String> tags,
        String type,
        @Nullable ImageTemplateVmProfileResponse vmProfile) {
        this.buildTimeoutInMinutes = buildTimeoutInMinutes;
        this.customize = customize;
        this.distribute = Objects.requireNonNull(distribute);
        this.id = Objects.requireNonNull(id);
        this.identity = Objects.requireNonNull(identity);
        this.lastRunStatus = Objects.requireNonNull(lastRunStatus);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.provisioningError = Objects.requireNonNull(provisioningError);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.source = Objects.requireNonNull(source);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.vmProfile = vmProfile;
    }

    public Optional<Integer> getBuildTimeoutInMinutes() {
        return Optional.ofNullable(this.buildTimeoutInMinutes);
    }
    public List<Object> getCustomize() {
        return this.customize == null ? List.of() : this.customize;
    }
    public List<Object> getDistribute() {
        return this.distribute;
    }
    public String getId() {
        return this.id;
    }
    public ImageTemplateIdentityResponse getIdentity() {
        return this.identity;
    }
    public ImageTemplateLastRunStatusResponse getLastRunStatus() {
        return this.lastRunStatus;
    }
    public String getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
    }
    public ProvisioningErrorResponse getProvisioningError() {
        return this.provisioningError;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Object getSource() {
        return this.source;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public String getType() {
        return this.type;
    }
    public Optional<ImageTemplateVmProfileResponse> getVmProfile() {
        return Optional.ofNullable(this.vmProfile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualMachineImageTemplateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer buildTimeoutInMinutes;
        private @Nullable List<Object> customize;
        private List<Object> distribute;
        private String id;
        private ImageTemplateIdentityResponse identity;
        private ImageTemplateLastRunStatusResponse lastRunStatus;
        private String location;
        private String name;
        private ProvisioningErrorResponse provisioningError;
        private String provisioningState;
        private Object source;
        private @Nullable Map<String,String> tags;
        private String type;
        private @Nullable ImageTemplateVmProfileResponse vmProfile;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualMachineImageTemplateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buildTimeoutInMinutes = defaults.buildTimeoutInMinutes;
    	      this.customize = defaults.customize;
    	      this.distribute = defaults.distribute;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.lastRunStatus = defaults.lastRunStatus;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningError = defaults.provisioningError;
    	      this.provisioningState = defaults.provisioningState;
    	      this.source = defaults.source;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.vmProfile = defaults.vmProfile;
        }

        public Builder setBuildTimeoutInMinutes(@Nullable Integer buildTimeoutInMinutes) {
            this.buildTimeoutInMinutes = buildTimeoutInMinutes;
            return this;
        }

        public Builder setCustomize(@Nullable List<Object> customize) {
            this.customize = customize;
            return this;
        }

        public Builder setDistribute(List<Object> distribute) {
            this.distribute = Objects.requireNonNull(distribute);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(ImageTemplateIdentityResponse identity) {
            this.identity = Objects.requireNonNull(identity);
            return this;
        }

        public Builder setLastRunStatus(ImageTemplateLastRunStatusResponse lastRunStatus) {
            this.lastRunStatus = Objects.requireNonNull(lastRunStatus);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningError(ProvisioningErrorResponse provisioningError) {
            this.provisioningError = Objects.requireNonNull(provisioningError);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSource(Object source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVmProfile(@Nullable ImageTemplateVmProfileResponse vmProfile) {
            this.vmProfile = vmProfile;
            return this;
        }

        public GetVirtualMachineImageTemplateResult build() {
            return new GetVirtualMachineImageTemplateResult(buildTimeoutInMinutes, customize, distribute, id, identity, lastRunStatus, location, name, provisioningError, provisioningState, source, tags, type, vmProfile);
        }
    }
}