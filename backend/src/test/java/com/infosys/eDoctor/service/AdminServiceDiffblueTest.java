package com.infosys.eDoctor.service;

import static org.junit.jupiter.api.Assertions.assertFalse;

import com.infosys.eDoctor.config.AdminProperties;
import com.infosys.eDoctor.entity.Admin;
import com.infosys.eDoctor.entity.Doctor;
import com.infosys.eDoctor.entity.Patient;
import com.infosys.eDoctor.entity.Users;
import com.infosys.eDoctor.repository.AdminRepo;
import com.infosys.eDoctor.repository.DoctorRepo;
import com.infosys.eDoctor.repository.FeedbackRepo;
import com.infosys.eDoctor.repository.PatientRepo;
import com.infosys.eDoctor.repository.UsersRepo;

import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.aot.DisabledInAotMode;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {AdminService.class, AdminProperties.class, AdminRepo.class, DoctorRepo.class,
        FeedbackRepo.class, PatientRepo.class, UsersRepo.class})
@ExtendWith(SpringExtension.class)
@DisabledInAotMode
class AdminServiceDiffblueTest {
    @Autowired
    private AdminProperties adminProperties;

    @MockBean
    private AdminRepo adminRepo;

    @Autowired
    private AdminService adminService;

    @MockBean
    private DoctorRepo doctorRepo;

    @MockBean
    private FeedbackRepo feedbackRepo;

    @MockBean
    private PatientRepo patientRepo;

    @MockBean
    private UsersRepo usersRepo;

    /**
     * Test {@link AdminService#authenticateAdmin(String, String)}.
     * <p>
     * Method under test: {@link AdminService#authenticateAdmin(String, String)}
     */
    @Test
    @DisplayName("Test authenticateAdmin(String, String)")
    void testAuthenticateAdmin() {
        // Arrange, Act and Assert
        assertFalse(adminService.authenticateAdmin("Adminname", "iloveyou"));
    }

    /**
     * Test {@link AdminService#getTotalDoctors()}.
     * <p>
     * Method under test: {@link AdminService#getTotalDoctors()}
     */
    @Test
    @DisplayName("Test getTotalDoctors()")
    @Disabled("TODO: Complete this test")
    void testGetTotalDoctors() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@2a520837 testClass = com.infosys.eDoctor.service.DiffblueFakeClass50, locations = [], classes = [com.infosys.eDoctor.service.AdminService, com.infosys.eDoctor.config.AdminProperties, com.infosys.eDoctor.repository.AdminRepo, com.infosys.eDoctor.repository.DoctorRepo, com.infosys.eDoctor.repository.FeedbackRepo, com.infosys.eDoctor.repository.PatientRepo, com.infosys.eDoctor.repository.UsersRepo], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@381b0d5d, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@f4ebeb7, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@2e19e6e0, org.springframework.boot.test.autoconfigure.OnFailureConditionReportContextCustomizerFactory$OnFailureConditionReportContextCustomizer@35b86245, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@48e83b04], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //       at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:212)
        //       at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1709)
        //       at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:556)
        //       at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:546)
        //       at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        //       at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:702)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange and Act
        adminService.getTotalDoctors();
    }

    /**
     * Test {@link AdminService#getTotalPatients()}.
     * <p>
     * Method under test: {@link AdminService#getTotalPatients()}
     */
    @Test
    @DisplayName("Test getTotalPatients()")
    @Disabled("TODO: Complete this test")
    void testGetTotalPatients() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@4d8d1d06 testClass = com.infosys.eDoctor.service.DiffblueFakeClass52, locations = [], classes = [com.infosys.eDoctor.service.AdminService, com.infosys.eDoctor.config.AdminProperties, com.infosys.eDoctor.repository.AdminRepo, com.infosys.eDoctor.repository.DoctorRepo, com.infosys.eDoctor.repository.FeedbackRepo, com.infosys.eDoctor.repository.PatientRepo, com.infosys.eDoctor.repository.UsersRepo], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@381b0d5d, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@f4ebeb7, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@2e19e6e0, org.springframework.boot.test.autoconfigure.OnFailureConditionReportContextCustomizerFactory$OnFailureConditionReportContextCustomizer@35b86245, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@48e83b04], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //       at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:212)
        //       at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1709)
        //       at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:556)
        //       at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:546)
        //       at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        //       at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:702)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange and Act
        adminService.getTotalPatients();
    }

    /**
     * Test {@link AdminService#getTotalFeedbacks()}.
     * <p>
     * Method under test: {@link AdminService#getTotalFeedbacks()}
     */
    @Test
    @DisplayName("Test getTotalFeedbacks()")
    @Disabled("TODO: Complete this test")
    void testGetTotalFeedbacks() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@5d82e97c testClass = com.infosys.eDoctor.service.DiffblueFakeClass51, locations = [], classes = [com.infosys.eDoctor.service.AdminService, com.infosys.eDoctor.config.AdminProperties, com.infosys.eDoctor.repository.AdminRepo, com.infosys.eDoctor.repository.DoctorRepo, com.infosys.eDoctor.repository.FeedbackRepo, com.infosys.eDoctor.repository.PatientRepo, com.infosys.eDoctor.repository.UsersRepo], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@381b0d5d, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@f4ebeb7, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@2e19e6e0, org.springframework.boot.test.autoconfigure.OnFailureConditionReportContextCustomizerFactory$OnFailureConditionReportContextCustomizer@35b86245, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@48e83b04], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //       at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:212)
        //       at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1709)
        //       at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:556)
        //       at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:546)
        //       at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        //       at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:702)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange and Act
        adminService.getTotalFeedbacks();
    }

    /**
     * Test {@link AdminService#getTotalUsers()}.
     * <p>
     * Method under test: {@link AdminService#getTotalUsers()}
     */
    @Test
    @DisplayName("Test getTotalUsers()")
    @Disabled("TODO: Complete this test")
    void testGetTotalUsers() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@12c70de6 testClass = com.infosys.eDoctor.service.DiffblueFakeClass53, locations = [], classes = [com.infosys.eDoctor.service.AdminService, com.infosys.eDoctor.config.AdminProperties, com.infosys.eDoctor.repository.AdminRepo, com.infosys.eDoctor.repository.DoctorRepo, com.infosys.eDoctor.repository.FeedbackRepo, com.infosys.eDoctor.repository.PatientRepo, com.infosys.eDoctor.repository.UsersRepo], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@381b0d5d, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@f4ebeb7, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@2e19e6e0, org.springframework.boot.test.autoconfigure.OnFailureConditionReportContextCustomizerFactory$OnFailureConditionReportContextCustomizer@35b86245, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@48e83b04], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //       at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:212)
        //       at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1709)
        //       at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:556)
        //       at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:546)
        //       at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        //       at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:702)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange and Act
        adminService.getTotalUsers();
    }

    /**
     * Test {@link AdminService#getAllUsers()}.
     * <p>
     * Method under test: {@link AdminService#getAllUsers()}
     */
    @Test
    @DisplayName("Test getAllUsers()")
    @Disabled("TODO: Complete this test")
    void testGetAllUsers() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@22fa1899 testClass = com.infosys.eDoctor.service.DiffblueFakeClass49, locations = [], classes = [com.infosys.eDoctor.service.AdminService, com.infosys.eDoctor.config.AdminProperties, com.infosys.eDoctor.repository.AdminRepo, com.infosys.eDoctor.repository.DoctorRepo, com.infosys.eDoctor.repository.FeedbackRepo, com.infosys.eDoctor.repository.PatientRepo, com.infosys.eDoctor.repository.UsersRepo], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@381b0d5d, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@f4ebeb7, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@2e19e6e0, org.springframework.boot.test.autoconfigure.OnFailureConditionReportContextCustomizerFactory$OnFailureConditionReportContextCustomizer@35b86245, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@48e83b04], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //       at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:212)
        //       at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1709)
        //       at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:556)
        //       at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:546)
        //       at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        //       at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:702)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange and Act
        adminService.getAllUsers();
    }

    /**
     * Test {@link AdminService#saveAdmin(Admin)}.
     * <p>
     * Method under test: {@link AdminService#saveAdmin(Admin)}
     */
    @Test
    @DisplayName("Test saveAdmin(Admin)")
    @Disabled("TODO: Complete this test")
    void testSaveAdmin() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@713278d7 testClass = com.infosys.eDoctor.service.DiffblueFakeClass54, locations = [], classes = [com.infosys.eDoctor.service.AdminService, com.infosys.eDoctor.config.AdminProperties, com.infosys.eDoctor.repository.AdminRepo, com.infosys.eDoctor.repository.DoctorRepo, com.infosys.eDoctor.repository.FeedbackRepo, com.infosys.eDoctor.repository.PatientRepo, com.infosys.eDoctor.repository.UsersRepo], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@381b0d5d, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@f4ebeb7, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@2e19e6e0, org.springframework.boot.test.autoconfigure.OnFailureConditionReportContextCustomizerFactory$OnFailureConditionReportContextCustomizer@35b86245, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@48e83b04], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //       at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:212)
        //       at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1709)
        //       at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:556)
        //       at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:546)
        //       at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        //       at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:702)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange
        Admin admin = new Admin();
        admin.setAdminname("Adminname");
        admin.setPassword("iloveyou");

        // Act
        adminService.saveAdmin(admin);
    }

    /**
     * Test {@link AdminService#saveDefaultAdmin()}.
     * <p>
     * Method under test: {@link AdminService#saveDefaultAdmin()}
     */
    @Test
    @DisplayName("Test saveDefaultAdmin()")
    @Disabled("TODO: Complete this test")
    void testSaveDefaultAdmin() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@5b3f0fe9 testClass = com.infosys.eDoctor.service.DiffblueFakeClass55, locations = [], classes = [com.infosys.eDoctor.service.AdminService, com.infosys.eDoctor.config.AdminProperties, com.infosys.eDoctor.repository.AdminRepo, com.infosys.eDoctor.repository.DoctorRepo, com.infosys.eDoctor.repository.FeedbackRepo, com.infosys.eDoctor.repository.PatientRepo, com.infosys.eDoctor.repository.UsersRepo], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@381b0d5d, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@f4ebeb7, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@2e19e6e0, org.springframework.boot.test.autoconfigure.OnFailureConditionReportContextCustomizerFactory$OnFailureConditionReportContextCustomizer@35b86245, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@48e83b04], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //       at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:212)
        //       at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1709)
        //       at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:556)
        //       at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:546)
        //       at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        //       at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:702)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange and Act
        adminService.saveDefaultAdmin();
    }

    /**
     * Test {@link AdminService#updateDoctor(Doctor)}.
     * <p>
     * Method under test: {@link AdminService#updateDoctor(Doctor)}
     */
    @Test
    @DisplayName("Test updateDoctor(Doctor)")
    @Disabled("TODO: Complete this test")
    void testUpdateDoctor() throws UnsupportedEncodingException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@3ff34b58 testClass = com.infosys.eDoctor.service.DiffblueFakeClass56, locations = [], classes = [com.infosys.eDoctor.service.AdminService, com.infosys.eDoctor.config.AdminProperties, com.infosys.eDoctor.repository.AdminRepo, com.infosys.eDoctor.repository.DoctorRepo, com.infosys.eDoctor.repository.FeedbackRepo, com.infosys.eDoctor.repository.PatientRepo, com.infosys.eDoctor.repository.UsersRepo], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@745d5cec, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@47def41f, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@5477bcf4, org.springframework.boot.test.autoconfigure.OnFailureConditionReportContextCustomizerFactory$OnFailureConditionReportContextCustomizer@9c0bea7, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@311ad79a], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //       at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:212)
        //       at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1709)
        //       at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:556)
        //       at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:546)
        //       at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        //       at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:702)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange
        Users users = new Users();
        users.setDoctor(new Doctor());
        users.setEmail("jane.doe@example.org");
        users.setName("Name");
        users.setPassword("iloveyou");
        users.setPatient(new Patient());
        users.setResetToken("ABC123");
        users.setResetTokenExpiry(LocalDate.of(1970, 1, 1).atStartOfDay());
        users.setUserType("User Type");

        Doctor doctor = new Doctor();
        doctor.setAppointments(new ArrayList<>());
        doctor.setDoctorId("42");
        doctor.setDoctorName("Doctor Name");
        doctor.setExperience("Experience");
        doctor.setLocation("Location");
        doctor.setMobileNo("Mobile No");
        doctor.setProfilePhoto("AXAXAXAX".getBytes("UTF-8"));
        doctor.setSpeciality("Speciality");
        doctor.setUsers(users);

        Users users2 = new Users();
        users2.setDoctor(new Doctor());
        users2.setEmail("jane.doe@example.org");
        users2.setName("Name");
        users2.setPassword("iloveyou");
        users2.setPatient(new Patient());
        users2.setResetToken("ABC123");
        users2.setResetTokenExpiry(LocalDate.of(1970, 1, 1).atStartOfDay());
        users2.setUserType("User Type");

        Patient patient = new Patient();
        patient.setAddress("42 Main St");
        patient.setAge(1);
        patient.setAppointments(new ArrayList<>());
        patient.setBloodGroup("Blood Group");
        patient.setGender("Gender");
        patient.setMobileNo("Mobile No");
        patient.setPatientId(1);
        patient.setPatientName("Patient Name");
        patient.setRequestStatus("Request Status");
        patient.setUsers2(users2);

        Users users3 = new Users();
        users3.setDoctor(doctor);
        users3.setEmail("jane.doe@example.org");
        users3.setName("Name");
        users3.setPassword("iloveyou");
        users3.setPatient(patient);
        users3.setResetToken("ABC123");
        users3.setResetTokenExpiry(LocalDate.of(1970, 1, 1).atStartOfDay());
        users3.setUserType("User Type");

        Doctor doctor2 = new Doctor();
        doctor2.setAppointments(new ArrayList<>());
        doctor2.setDoctorId("42");
        doctor2.setDoctorName("Doctor Name");
        doctor2.setExperience("Experience");
        doctor2.setLocation("Location");
        doctor2.setMobileNo("Mobile No");
        doctor2.setProfilePhoto("AXAXAXAX".getBytes("UTF-8"));
        doctor2.setSpeciality("Speciality");
        doctor2.setUsers(users3);

        // Act
        adminService.updateDoctor(doctor2);
    }

    /**
     * Test {@link AdminService#deleteDoctor(String)}.
     * <p>
     * Method under test: {@link AdminService#deleteDoctor(String)}
     */
    @Test
    @DisplayName("Test deleteDoctor(String)")
    @Disabled("TODO: Complete this test")
    void testDeleteDoctor() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@720a2eba testClass = com.infosys.eDoctor.service.DiffblueFakeClass47, locations = [], classes = [com.infosys.eDoctor.service.AdminService, com.infosys.eDoctor.config.AdminProperties, com.infosys.eDoctor.repository.AdminRepo, com.infosys.eDoctor.repository.DoctorRepo, com.infosys.eDoctor.repository.FeedbackRepo, com.infosys.eDoctor.repository.PatientRepo, com.infosys.eDoctor.repository.UsersRepo], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@381b0d5d, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@f4ebeb7, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@2e19e6e0, org.springframework.boot.test.autoconfigure.OnFailureConditionReportContextCustomizerFactory$OnFailureConditionReportContextCustomizer@35b86245, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@48e83b04], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //       at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:212)
        //       at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1709)
        //       at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:556)
        //       at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:546)
        //       at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        //       at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:702)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange and Act
        adminService.deleteDoctor("42");
    }

    /**
     * Test {@link AdminService#updatePatient(Patient)}.
     * <p>
     * Method under test: {@link AdminService#updatePatient(Patient)}
     */
    @Test
    @DisplayName("Test updatePatient(Patient)")
    @Disabled("TODO: Complete this test")
    void testUpdatePatient() throws UnsupportedEncodingException {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@67895c93 testClass = com.infosys.eDoctor.service.DiffblueFakeClass57, locations = [], classes = [com.infosys.eDoctor.service.AdminService, com.infosys.eDoctor.config.AdminProperties, com.infosys.eDoctor.repository.AdminRepo, com.infosys.eDoctor.repository.DoctorRepo, com.infosys.eDoctor.repository.FeedbackRepo, com.infosys.eDoctor.repository.PatientRepo, com.infosys.eDoctor.repository.UsersRepo], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@745d5cec, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@47def41f, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@5477bcf4, org.springframework.boot.test.autoconfigure.OnFailureConditionReportContextCustomizerFactory$OnFailureConditionReportContextCustomizer@9c0bea7, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@311ad79a], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //       at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:212)
        //       at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1709)
        //       at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:556)
        //       at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:546)
        //       at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        //       at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:702)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange
        Users users = new Users();
        users.setDoctor(new Doctor());
        users.setEmail("jane.doe@example.org");
        users.setName("Name");
        users.setPassword("iloveyou");
        users.setPatient(new Patient());
        users.setResetToken("ABC123");
        users.setResetTokenExpiry(LocalDate.of(1970, 1, 1).atStartOfDay());
        users.setUserType("User Type");

        Doctor doctor = new Doctor();
        doctor.setAppointments(new ArrayList<>());
        doctor.setDoctorId("42");
        doctor.setDoctorName("Doctor Name");
        doctor.setExperience("Experience");
        doctor.setLocation("Location");
        doctor.setMobileNo("Mobile No");
        doctor.setProfilePhoto("AXAXAXAX".getBytes("UTF-8"));
        doctor.setSpeciality("Speciality");
        doctor.setUsers(users);

        Users users2 = new Users();
        users2.setDoctor(new Doctor());
        users2.setEmail("jane.doe@example.org");
        users2.setName("Name");
        users2.setPassword("iloveyou");
        users2.setPatient(new Patient());
        users2.setResetToken("ABC123");
        users2.setResetTokenExpiry(LocalDate.of(1970, 1, 1).atStartOfDay());
        users2.setUserType("User Type");

        Patient patient = new Patient();
        patient.setAddress("42 Main St");
        patient.setAge(1);
        patient.setAppointments(new ArrayList<>());
        patient.setBloodGroup("Blood Group");
        patient.setGender("Gender");
        patient.setMobileNo("Mobile No");
        patient.setPatientId(1);
        patient.setPatientName("Patient Name");
        patient.setRequestStatus("Request Status");
        patient.setUsers2(users2);

        Users users22 = new Users();
        users22.setDoctor(doctor);
        users22.setEmail("jane.doe@example.org");
        users22.setName("Name");
        users22.setPassword("iloveyou");
        users22.setPatient(patient);
        users22.setResetToken("ABC123");
        users22.setResetTokenExpiry(LocalDate.of(1970, 1, 1).atStartOfDay());
        users22.setUserType("User Type");

        Patient patient2 = new Patient();
        patient2.setAddress("42 Main St");
        patient2.setAge(1);
        patient2.setAppointments(new ArrayList<>());
        patient2.setBloodGroup("Blood Group");
        patient2.setGender("Gender");
        patient2.setMobileNo("Mobile No");
        patient2.setPatientId(1);
        patient2.setPatientName("Patient Name");
        patient2.setRequestStatus("Request Status");
        patient2.setUsers2(users22);

        // Act
        adminService.updatePatient(patient2);
    }

    /**
     * Test {@link AdminService#deletePatient(String)}.
     * <p>
     * Method under test: {@link AdminService#deletePatient(String)}
     */
    @Test
    @DisplayName("Test deletePatient(String)")
    @Disabled("TODO: Complete this test")
    void testDeletePatient() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: ApplicationContext failure threshold (1) exceeded: skipping repeated attempt to load context for [MergedContextConfiguration@c218b34 testClass = com.infosys.eDoctor.service.DiffblueFakeClass48, locations = [], classes = [com.infosys.eDoctor.service.AdminService, com.infosys.eDoctor.config.AdminProperties, com.infosys.eDoctor.repository.AdminRepo, com.infosys.eDoctor.repository.DoctorRepo, com.infosys.eDoctor.repository.FeedbackRepo, com.infosys.eDoctor.repository.PatientRepo, com.infosys.eDoctor.repository.UsersRepo], contextInitializerClasses = [], activeProfiles = [], propertySourceDescriptors = [], propertySourceProperties = [], contextCustomizers = [org.springframework.boot.test.context.filter.ExcludeFilterContextCustomizer@381b0d5d, org.springframework.boot.test.json.DuplicateJsonObjectContextCustomizerFactory$DuplicateJsonObjectContextCustomizer@f4ebeb7, org.springframework.boot.test.mock.mockito.MockitoContextCustomizer@0, org.springframework.boot.test.web.reactor.netty.DisableReactorResourceFactoryGlobalResourcesContextCustomizerFactory$DisableReactorResourceFactoryGlobalResourcesContextCustomizerCustomizer@2e19e6e0, org.springframework.boot.test.autoconfigure.OnFailureConditionReportContextCustomizerFactory$OnFailureConditionReportContextCustomizer@35b86245, org.springframework.boot.test.autoconfigure.actuate.observability.ObservabilityContextCustomizerFactory$DisableObservabilityContextCustomizer@1f, org.springframework.boot.test.autoconfigure.properties.PropertyMappingContextCustomizer@0, org.springframework.boot.test.autoconfigure.web.servlet.WebDriverContextCustomizer@48e83b04], contextLoader = org.springframework.test.context.support.DelegatingSmartContextLoader, parent = null]
        //       at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:145)
        //       at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:130)
        //       at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:212)
        //       at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1709)
        //       at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:556)
        //       at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:546)
        //       at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
        //       at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        //       at java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:702)
        //   See https://diff.blue/R026 to resolve this issue.

        // Arrange and Act
        adminService.deletePatient("42");
    }
}
