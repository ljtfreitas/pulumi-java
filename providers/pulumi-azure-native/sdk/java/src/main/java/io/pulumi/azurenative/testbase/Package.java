// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase;

import io.pulumi.azurenative.Utilities;
import io.pulumi.azurenative.testbase.PackageArgs;
import io.pulumi.azurenative.testbase.outputs.PackageValidationResultResponse;
import io.pulumi.azurenative.testbase.outputs.SystemDataResponse;
import io.pulumi.azurenative.testbase.outputs.TargetOSInfoResponse;
import io.pulumi.azurenative.testbase.outputs.TestResponse;
import io.pulumi.core.Alias;
import io.pulumi.core.Input;
import io.pulumi.core.Output;
import io.pulumi.core.internal.annotations.OutputExport;
import io.pulumi.core.internal.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

@ResourceType(type="azure-native:testbase:Package")
public class Package extends io.pulumi.resources.CustomResource {
    @OutputExport(name="applicationName", type=String.class, parameters={})
    private Output<String> applicationName;

    public Output<String> getApplicationName() {
        return this.applicationName;
    }
    @OutputExport(name="blobPath", type=String.class, parameters={})
    private Output<String> blobPath;

    public Output<String> getBlobPath() {
        return this.blobPath;
    }
    @OutputExport(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> getEtag() {
        return this.etag;
    }
    @OutputExport(name="flightingRing", type=String.class, parameters={})
    private Output<String> flightingRing;

    public Output<String> getFlightingRing() {
        return this.flightingRing;
    }
    @OutputExport(name="isEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> isEnabled;

    public Output<Boolean> getIsEnabled() {
        return this.isEnabled;
    }
    @OutputExport(name="lastModifiedTime", type=String.class, parameters={})
    private Output<String> lastModifiedTime;

    public Output<String> getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    @OutputExport(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> getLocation() {
        return this.location;
    }
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    public Output<String> getName() {
        return this.name;
    }
    @OutputExport(name="packageStatus", type=String.class, parameters={})
    private Output<String> packageStatus;

    public Output<String> getPackageStatus() {
        return this.packageStatus;
    }
    @OutputExport(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> getProvisioningState() {
        return this.provisioningState;
    }
    @OutputExport(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    public Output<SystemDataResponse> getSystemData() {
        return this.systemData;
    }
    @OutputExport(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    @OutputExport(name="targetOSList", type=List.class, parameters={TargetOSInfoResponse.class})
    private Output<List<TargetOSInfoResponse>> targetOSList;

    public Output<List<TargetOSInfoResponse>> getTargetOSList() {
        return this.targetOSList;
    }
    @OutputExport(name="testTypes", type=List.class, parameters={String.class})
    private Output<List<String>> testTypes;

    public Output<List<String>> getTestTypes() {
        return this.testTypes;
    }
    @OutputExport(name="tests", type=List.class, parameters={TestResponse.class})
    private Output<List<TestResponse>> tests;

    public Output<List<TestResponse>> getTests() {
        return this.tests;
    }
    @OutputExport(name="type", type=String.class, parameters={})
    private Output<String> type;

    public Output<String> getType() {
        return this.type;
    }
    @OutputExport(name="validationResults", type=List.class, parameters={PackageValidationResultResponse.class})
    private Output<List<PackageValidationResultResponse>> validationResults;

    public Output<List<PackageValidationResultResponse>> getValidationResults() {
        return this.validationResults;
    }
    @OutputExport(name="version", type=String.class, parameters={})
    private Output<String> version;

    public Output<String> getVersion() {
        return this.version;
    }

    public Package(String name, PackageArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:testbase:Package", name, args == null ? PackageArgs.Empty : args, makeResourceOptions(options, Input.empty()));
    }

    private Package(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:testbase:Package", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Input<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .setAliases(List.of(
                Input.of(Alias.builder().setType("azure-native:testbase/v20201216preview:Package").build())
            ))
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    public static Package get(String name, Input<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Package(name, id, options);
    }
}